package ru.svistunovaleksei.spring.mvc_hibernate_aop.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Name may not be empty")
    @Size(min = 0, max = 15, message = "Name must be between 1 and 15 characters long")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Surname may not be empty")
    @Size(min = 0, max = 25, message = "Name must be between 1 and 25 characters long")
    private String surname;

    @Column(name = "department")
    @NotBlank(message = "Department may not be empty")
    @Size(min = 0, max = 20, message = "Name must be between 1 and 20 characters long")
    private String department;

    @Column(name = "salary")
    @Min(value = 0, message = "Salary may not be less than 0")
    @Max(value = Integer.MAX_VALUE, message = "The salary cannot be more than 2000000000")
    private int salary;

    public Employee() {}

    public Employee(int id, String name, String surname, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
