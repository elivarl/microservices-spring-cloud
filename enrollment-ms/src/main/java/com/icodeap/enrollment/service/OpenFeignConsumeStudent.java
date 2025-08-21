package com.icodeap.enrollment.service;

import com.icodeap.enrollment.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient (url = "http://localhost:8081", value = "students-ms")
@FeignClient (name = "students-ms")
public interface OpenFeignConsumeStudent {
    @GetMapping("/api/v1/students/identification-number/{identification}")
    public StudentDTO findByIdentificationNumber(@PathVariable("identification") String identificationNumber);
}
