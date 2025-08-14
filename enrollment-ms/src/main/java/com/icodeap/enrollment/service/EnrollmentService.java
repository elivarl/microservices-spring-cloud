package com.icodeap.enrollment.service;


import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.dto.EnrollmentResponseDTO;
import com.icodeap.enrollment.entity.Enrollment;

public interface EnrollmentService {
    EnrollmentDTO save(EnrollmentDTO enrollmentDTO);
    EnrollmentResponseDTO findById(Long id);

}
