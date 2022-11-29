package com.employeemanager.employeemanager.service.impl;

import com.employeemanager.employeemanager.model.Employee;
import com.employeemanager.employeemanager.repo.EmployeeRepo;
import com.employeemanager.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

}
