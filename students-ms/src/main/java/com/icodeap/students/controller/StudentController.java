package com.icodeap.students.controller;

import com.icodeap.students.dto.StudentDTO;
import com.icodeap.students.entity.Student;
import com.icodeap.students.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    //POST
    //http://localhost:8081/api/v1/students
    @PostMapping
    public StudentDTO save (@RequestBody StudentDTO studentDTO){
        return studentService.save(studentDTO);
    }

    //GET
    //http://localhost:8081/api/v1/students/12244343434
    //http://localhost:8081/api/v1/students/identification-number/
    @GetMapping("/identification-number/{identification}")
    public StudentDTO findByIdentificationNumber(@PathVariable("identification") String identificationNumber){
        return studentService.findByIdentificationNumber(identificationNumber);
    }
}
