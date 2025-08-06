package com.icodeap.course.service;

import com.icodeap.course.dto.CourseDTO;
import com.icodeap.course.entity.Course;

public interface CourseService {
    CourseDTO save(CourseDTO courseDTO);
    CourseDTO findByCourseCode(String courseCode);
}
