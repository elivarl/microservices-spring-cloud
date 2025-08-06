package com.icodeap.enrollment.mapper;

import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.entity.Enrollment;

public class EnrollmentMapper {

    public static EnrollmentDTO toDTO (Enrollment enrollment){
        return new EnrollmentDTO(
                enrollment.getId(),
                enrollment.getCourseCode(),
                enrollment.getIdentificationNumber(),
                enrollment.getEnrollmentDate()
        );
    }
}
