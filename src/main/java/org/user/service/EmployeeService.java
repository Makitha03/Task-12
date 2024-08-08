package org.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.model.Employee;
import org.user.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> displayAll() {
        return employeeRepository.findAll();
    }

    public Employee displayById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
