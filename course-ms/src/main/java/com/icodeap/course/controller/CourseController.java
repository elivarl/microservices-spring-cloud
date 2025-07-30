package com.icodeap.course.controller;

import com.icodeap.course.entity.Course;
import com.icodeap.course.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    //POST
    //http://localhost:8082/api/v1/courses
    @PostMapping
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    //GET
    //http://localhost:8082/api/v1/courses/course-code/course101
    @GetMapping ("/course-code/{code}")
    public Course findByCourseCode(@PathVariable("code") String courseCode){
        return courseService.findByCourseCode(courseCode);
    }

}
