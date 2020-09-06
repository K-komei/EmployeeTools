package com.Employee.Apps.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;


	@Entity
	@Data

	@Table(name="employee_table")
	public class Employee_Entity implements Serializable {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column("id")
	    private long id;

	    @Column("employee_name")
	    private String employee_name;

	    @Id
	    @Column("employee_num")
	    private long employee_num;

	    @Column("employee_sex")
	    private String employee_sex;

	    @Column("employee_age")
	    private long employee_age;

	    @Column("employee_department")
	    private String employee_department;

	    @Column("employee_class")
	    private String employee_class;


	}
