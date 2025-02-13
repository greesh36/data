package com.pg.employee.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employeedto {

    private int empId;


    private String empName;


    private int empSalary;


    private int empPhno;




}
