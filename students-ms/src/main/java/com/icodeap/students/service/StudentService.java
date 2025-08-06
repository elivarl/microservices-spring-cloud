package com.icodeap.students.service;

import com.icodeap.students.dto.StudentDTO;
import com.icodeap.students.entity.Student;

public interface StudentService {
    StudentDTO save (StudentDTO studentDTO);
    StudentDTO findByIdentificationNumber (String identificationNumber);
}
