package com.icodeap.students.dto;

public record StudentDTO(
        Long id,
        String identificationNumber,
        String name,
        String email
) {
}
