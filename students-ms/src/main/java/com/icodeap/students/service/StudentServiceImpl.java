package com.icodeap.students.service;

import com.icodeap.students.dto.StudentDTO;
import com.icodeap.students.entity.Student;
import com.icodeap.students.mapper.StudentMapper;
import com.icodeap.students.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        //Student student = modelMapper.map(studentDTO, Student.class);
        //Student studentDB = studentRepository.save(student);
        //StudentDTO dto = StudentMapper.toDTO(studentDB);
        return StudentMapper.toDTO(studentRepository.save( modelMapper.map(studentDTO, Student.class)));
    }

    @Override
    public StudentDTO findByIdentificationNumber(String identificationNumber) {
        //Student studentDB = studentRepository.findByIdentificationNumber(identificationNumber);
        //StudentDTO studentDTO = StudentMapper.toDTO(studentDB);
        return StudentMapper.toDTO(studentRepository.findByIdentificationNumber(identificationNumber));
    }
}
