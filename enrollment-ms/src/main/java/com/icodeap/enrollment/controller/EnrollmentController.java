package com.icodeap.enrollment.controller;

import com.icodeap.enrollment.dto.EnrollmentDTO;
import com.icodeap.enrollment.dto.EnrollmentResponseDTO;
import com.icodeap.enrollment.service.EnrollmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/enrollments")
public class EnrollmentController {
    private final EnrollmentService enrollmentService;

    //POST
    //http://localhost:8080/api/v1/enrollments

    @PostMapping
    public EnrollmentDTO save(@RequestBody EnrollmentDTO enrollmentDTO){
        return enrollmentService.save(enrollmentDTO);
    }

    //GET
    //http://localhost:8080/api/v1/enrollments/1
    @GetMapping("/{id}")
    public EnrollmentResponseDTO findById(@PathVariable Long id){
        return enrollmentService.findById(id);
    }


}
