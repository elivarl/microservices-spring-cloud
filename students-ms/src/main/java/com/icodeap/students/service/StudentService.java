package com.icodeap.students.service;

import com.icodeap.students.entity.Student;

public interface StudentService {
    Student save (Student student);
    Student findByIdentificationNumber (String identificationNumber);
}
