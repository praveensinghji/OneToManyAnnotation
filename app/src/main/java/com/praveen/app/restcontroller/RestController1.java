package com.praveen.app.restcontroller;
import com.praveen.app.entity.Department;
import com.praveen.app.entity.Student;
import com.praveen.app.service.DepartmentService;
import com.praveen.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestController1 {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public List<Department> getfindData(){
        return departmentService.findAll();
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/student")
    public List<Student> getFindData(){
        return studentService.students();
    }
}
