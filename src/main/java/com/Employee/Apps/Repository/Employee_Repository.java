package com.Employee.Apps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Apps.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{

}

