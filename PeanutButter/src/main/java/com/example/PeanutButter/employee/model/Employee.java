package com.example.PeanutButter.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String salutation;

    private String profileColour;

    private String gender;

    private double grossSalary;


}
