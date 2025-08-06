package com.icodeap.course.config;

import com.icodeap.course.dto.CourseDTO;
import com.icodeap.course.entity.Course;

public class CourseMapper {
    public static CourseDTO toDTO(Course course){
        return  new CourseDTO(
                course.getId(),
                course.getCourseCode(),
                course.getTitle(),
                course.getDescription()
        );
    }
}
