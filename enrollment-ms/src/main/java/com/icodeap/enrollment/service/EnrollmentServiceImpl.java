package com.icodeap.enrollment.service;

import com.icodeap.enrollment.dto.CourseDTO;
import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.dto.EnrollmentResponseDTO;
import com.icodeap.enrollment.dto.StudentDTO;
import com.icodeap.enrollment.entity.Enrollment;
import com.icodeap.enrollment.mapper.EnrollmentMapper;
import com.icodeap.enrollment.repository.EnrollmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService{
    private final EnrollmentRepository enrollmentRepository;
    private final ModelMapper modelMapper;
    //private final WebClient webClient;
    private final OpenFeignConsumeCourse openFeignConsumeCourse;
    private final OpenFeignConsumeStudent openFeignConsumeStudent;

    @Override
    public EnrollmentDTO save(EnrollmentDTO enrollmentDTO) {

        return EnrollmentMapper.toDTO(enrollmentRepository.save(modelMapper.map(enrollmentDTO, Enrollment.class)));
    }

    @Override
    public EnrollmentResponseDTO findById(Long id) {
        //return EnrollmentMapper.toDTO(enrollmentRepository.findById(id).get());

        Enrollment enrollmentDB = enrollmentRepository.findById(id).get();

       /* StudentDTO studentDTO = webClient.get().uri("http://localhost:8081/api/v1/students/identification-number/"+enrollmentDB.getIdentificationNumber())
                .retrieve()
                .bodyToMono(StudentDTO.class)
                .block();

        CourseDTO courseDTO = webClient.get().uri("http://localhost:8082/api/v1/courses/course-code/"+enrollmentDB.getCourseCode())
                .retrieve()
                .bodyToMono(CourseDTO.class)
                .block();*/
        StudentDTO studentDTO = openFeignConsumeStudent.findByIdentificationNumber(enrollmentDB.getIdentificationNumber());
        CourseDTO courseDTO = openFeignConsumeCourse.findByCourseCode(enrollmentDB.getCourseCode());


        EnrollmentDTO enrollmentDTO = EnrollmentMapper.toDTO(enrollmentDB);

        return  new EnrollmentResponseDTO(enrollmentDTO, courseDTO, studentDTO);

    }
}
