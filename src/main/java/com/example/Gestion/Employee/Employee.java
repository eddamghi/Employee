package com.example.Gestion.Employee;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name= "Employee_Sequence",
            sequenceName = "Employee_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Employee_Sequence"
    )
    private Long Id;
    private String Name;
    private LocalDate StartDate;
    private String email;
    @Transient
    private Integer Age;


    public Employee(Long id) {
        Id = id;
    }

    public Employee(Long id, String name,  LocalDate startDate, String email) {
        Id = id;
        Name = name;
        StartDate = startDate;
        this.email = email;
    }

    public Employee(String name, LocalDate startDate, String email) {
        Name = name;
        StartDate = startDate;
        this.email = email;
    }

    public Employee() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Period.between(StartDate,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", StartDate=" + StartDate +
                ", email='" + email + '\'' +
                '}';
    }
}
