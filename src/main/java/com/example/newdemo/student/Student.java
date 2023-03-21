package com.example.newdemo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private Integer age;

    public Student(String firstName, String lastName, LocalDateTime dateOfBirth, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }

    public Student() {}

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
