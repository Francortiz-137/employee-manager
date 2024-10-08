package com.employeemanager.employeemanager.service;

import com.employeemanager.employeemanager.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee updateEmployee(Employee employee);

    public Employee findEmployeeById(Long id);

    public void deleteEmployee(Long id);
}
