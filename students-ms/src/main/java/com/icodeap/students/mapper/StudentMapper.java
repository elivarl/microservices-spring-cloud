package com.icodeap.students.mapper;

import com.icodeap.students.dto.StudentDTO;
import com.icodeap.students.entity.Student;

public class StudentMapper {
    public static StudentDTO toDTO(Student student){
        return new StudentDTO(
                student.getId(),
                student.getIdentificationNumber(),
                student.getName(),
                student.getEmail()
        );
    }
}
