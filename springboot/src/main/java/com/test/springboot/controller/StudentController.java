package com.test.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.entity.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    // http://localhost:8080/student/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Dennis");
        student.setLastName("Lee");
        return ResponseEntity.ok()
        .header("custom-header", "Dennis").
        body(student);
    }
    // http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dennis1", "Lee"));
        students.add(new Student(1, "Dennis2", "Lee"));
        return ResponseEntity.ok(students);
    }
    // {id} -> @PathVariable
    // http://localhost:8080/students/1/Dennis/Lee
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(
        @PathVariable("id") int studentId,
        @PathVariable("first-name") String firstName,
        @PathVariable("last-name") String lastName){
        Student student = 
        new Student(studentId, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // http://localhost:8080/students/query?id=1&firstName=Dennis&lastName=Lee
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
    // {
    //     "id" : 1,
    //     "firstName" : "Dennis",
    //     "lastName" : "Lee"
    // }
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(
        @RequestBody Student student){
            System.out.println(student.getId() 
            + ", " + student.getFirstName()
            + ", " + student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
        System.out.println("Deleted : " + studentId);
        return ResponseEntity.ok("Student deleted");        
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, 
        @PathVariable("id") int studentId) {
            System.out.println(studentId);
        System.out.println(student.getId() 
        + ", " + student.getFirstName()
        + ", " + student.getLastName());
        return ResponseEntity.ok(student);        
    }

}
