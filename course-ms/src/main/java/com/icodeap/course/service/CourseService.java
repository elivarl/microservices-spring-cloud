package com.icodeap.course.service;

import com.icodeap.course.entity.Course;

public interface CourseService {
    Course save(Course course);
    Course findByCourseCode(String courseCode);
}
