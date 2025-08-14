package com.icodeap.enrollment.dto;

public record StudentDTO(
        Long id,
        String identificationNumber,
        String name,
        String email
) {
}
