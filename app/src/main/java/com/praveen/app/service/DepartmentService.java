package com.praveen.app.service;

import com.praveen.app.entity.Department;
import com.praveen.app.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DepartmentService {

    private DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentService (DepartmentRepo departmentRepo){
        this.departmentRepo = departmentRepo;
    }

    public List<Department> findAll(){
        return departmentRepo.findAll();
    }

    public Department save(Department department){
        return departmentRepo.save(department);
    }
}
