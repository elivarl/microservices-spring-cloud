package com.icodeap.enrollment.service;


import com.icodeap.enrollment.entity.Enrollment;

public interface EnrollmentService {
    Enrollment save(Enrollment enrollment);
    Enrollment findById(Long id);

}
