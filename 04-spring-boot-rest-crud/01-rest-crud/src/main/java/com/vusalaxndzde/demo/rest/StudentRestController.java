package com.vusalaxndzde.demo.rest;

import com.vusalaxndzde.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Vusal", "Akhundzada"));
        students.add(new Student("Walter", "White"));
        students.add(new Student("John", "Smith"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if ((studentId > students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }

        return students.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
