package com.icodeap.enrollment.service;


import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.entity.Enrollment;

public interface EnrollmentService {
    EnrollmentDTO save(EnrollmentDTO enrollmentDTO);
    EnrollmentDTO findById(Long id);

}
