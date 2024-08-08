package com.test.myapp11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp11.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByUsername(String username);
}
