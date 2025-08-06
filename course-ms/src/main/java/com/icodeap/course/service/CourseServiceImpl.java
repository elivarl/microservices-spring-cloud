package com.icodeap.course.service;

import com.icodeap.course.config.CourseMapper;
import com.icodeap.course.dto.CourseDTO;
import com.icodeap.course.entity.Course;
import com.icodeap.course.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    @Override
    public CourseDTO save(CourseDTO courseDTO) {
        return  CourseMapper.toDTO(courseRepository.save(modelMapper.map(courseDTO, Course.class)));
    }

    @Override
    public CourseDTO findByCourseCode(String courseCode) {
        //Course courseDB=courseRepository.findByCourseCode(courseCode);
        return  CourseMapper.toDTO(courseRepository.findByCourseCode(courseCode));
    }
}
