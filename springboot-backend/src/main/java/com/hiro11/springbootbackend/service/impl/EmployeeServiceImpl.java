package com.hiro11.springbootbackend.service.impl;

import com.hiro11.springbootbackend.model.Employee;
import com.hiro11.springbootbackend.repository.EmployeeRepository;
import com.hiro11.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
