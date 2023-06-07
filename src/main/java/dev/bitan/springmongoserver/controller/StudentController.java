package dev.bitan.springmongoserver.controller;

import dev.bitan.springmongoserver.models.Student;
import dev.bitan.springmongoserver.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student save = this.studentRepository.save(student);

        return ResponseEntity.ok(save);

    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }

}
