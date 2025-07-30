package com.icodeap.students.controller;

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
    public Student save (@RequestBody Student student){
        return studentService.save(student);
    }

    //GET
    //http://localhost:8081/api/v1/students/12244343434
    @GetMapping("/identification-number/{identification}")
    public Student findByIdentificationNumber(@PathVariable("identification") String identificationNumber){
        return studentService.findByIdentificationNumber(identificationNumber);
    }
}
