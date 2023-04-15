package com.vusalaxndzde.demo.rest;

import com.vusalaxndzde.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Vusal", "Akhundzada"));
        students.add(new Student("Walter", "White"));
        students.add(new Student("John", "Smith"));

        return students;
    }

}
