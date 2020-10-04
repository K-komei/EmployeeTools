package com.Employee.Apps.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Apps.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{

    @Query(value ="SELECT o FROM Employee_Entity o "
    		+ "WHERE employee_class LIKE :classValue "
    		+ "AND "
    		+ "employee_department LIKE :departmentValue "
    		+ "AND "
    		+ "employee_sex LIKE :sexValue")
    List<Employee_Entity> getFilterEmployeeList(
    		@Param("classValue") String classValue,
    		@Param("departmentValue") String departmentValue,
    		@Param("sexValue") String sexValue);


    @Query(value = "SELECT DISTINCT employee_class FROM Employee_Entity o")
    List<String> GetClassValue();

    @Query(value = "SELECT DISTINCT employee_department FROM Employee_Entity o")
    List<String> GetDepartmentValue();

    @Query(value = "SELECT DISTINCT employee_sex FROM Employee_Entity o")
    List<String> GetSexValue();


	}

