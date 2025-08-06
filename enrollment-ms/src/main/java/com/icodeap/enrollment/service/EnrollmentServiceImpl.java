package com.icodeap.enrollment.service;

import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.entity.Enrollment;
import com.icodeap.enrollment.mapper.EnrollmentMapper;
import com.icodeap.enrollment.repository.EnrollmentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService{
    private final EnrollmentRepository enrollmentRepository;
    private final ModelMapper modelMapper;

    @Override
    public EnrollmentDTO save(EnrollmentDTO enrollmentDTO) {

        return EnrollmentMapper.toDTO(enrollmentRepository.save(modelMapper.map(enrollmentDTO, Enrollment.class)));
    }

    @Override
    public EnrollmentDTO findById(Long id) {
        return EnrollmentMapper.toDTO(enrollmentRepository.findById(id).get());
    }
}
