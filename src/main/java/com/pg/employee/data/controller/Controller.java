package com.pg.employee.data.controller;

import com.pg.employee.data.Employeeservice.Employeeservice;
import com.pg.employee.data.dto.Employeedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Employee")
public class Controller {
    @Autowired
     private Employeeservice employeeservice;
@PostMapping("/create")
     public ResponseEntity<Employeedto> createEmployee(@RequestBody Employeedto employeedto){

         Employeedto savedemployee=employeeservice.createEmployee(employeedto);
         return new ResponseEntity<>(savedemployee, HttpStatus.CREATED) ;
     }
}
