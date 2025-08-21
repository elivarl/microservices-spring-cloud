package com.icodeap.enrollment.service;


import com.icodeap.enrollment.dto.CourseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8082", value = "course-ms")
public interface OpenFeignConsumeCourse {
    @GetMapping("/api/v1/courses/course-code/{code}")
    public CourseDTO findByCourseCode(@PathVariable("code") String courseCode);
}
