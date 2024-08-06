package com.demo.myapp5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.myapp5.entity.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Jiyun");
        student.setLastName("Kim");
        return ResponseEntity.ok()
        .header("custom-header", "Jiyun").
        body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jiyun", "Kim"));
        students.add(new Student(1, "Jimin", "Kim"));
        return ResponseEntity.ok(students);
    }

    // {id} -> @PathVariable
    // http://localhost:8080/students/1/Jiyun/Kim
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(
        @PathVariable("id") int studentId,
        @PathVariable("first-name") String firstName,
        @PathVariable("last-name") String lastName){
        Student student = 
        new Student(studentId, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // http://localhost:8080/students/query?id=1&firstName=Jiyun&lastName=Kim
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(
        @RequestParam int id,
        @RequestParam String firstName,
        @RequestParam String lastName
    ){
        Student student = 
        new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // @PostMapping @RequestBody

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {
        System.out.println("Deleted student " + id);
        return ResponseEntity.ok("Student Deleted!");
    }
}