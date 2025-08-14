package com.icodeap.enrollment.dto;

public record EnrollmentResponseDTO(
        EnrollmentDTO enrollmentDTO,
        CourseDTO courseDTO,
        StudentDTO studentDTO
) {
}
