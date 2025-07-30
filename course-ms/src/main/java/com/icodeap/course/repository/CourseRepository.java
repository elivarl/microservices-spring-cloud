package com.icodeap.course.repository;

import com.icodeap.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
    Course findByCourseCode(String courseCode);
}
