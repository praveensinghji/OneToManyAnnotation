package com.praveen.app.service;

import com.praveen.app.entity.Student;
import com.praveen.app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public List<Student> students (){
        return studentRepo.findAll();
    }
    public Student save (Student student){
        return studentRepo.save(student);
    }
}
