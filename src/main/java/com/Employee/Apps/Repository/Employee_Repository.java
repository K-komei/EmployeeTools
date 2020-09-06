package com.Employee.Apps.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Apps.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{
 public List<Employee_Entity> showAllDateList();
 public Employee_Entity showOneData(long id);

}

