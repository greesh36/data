package com.pg.employee.data.controller;

import com.pg.employee.data.Employeeservice.Employeeservice;
import com.pg.employee.data.dto.Employeedto;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class Controller {

     private Employeeservice employeeservice;

     @PostMapping
     public ResponseEntity<Employeedto> createEmployee(@RequestBody Employeedto employeedto){
         Employeedto savedemployee=employeeservice.createEmployee(employeedto);
         return new ResponseEntity<>(savedemployee, HttpStatus.CREATED) ;
     }

     @GetMapping("{id}")
     public ResponseEntity<Employeedto> getEmployee( @PathVariable("id") Long employeeId ){
        Employeedto get= employeeservice.getEmployee(employeeId);
        return ResponseEntity.ok(get);
     }
    @PutMapping ("/{id}")
    public ResponseEntity<Employeedto>updateEmployee(@PathVariable("id") Long employeeId,@RequestBody   Employeedto employeedto){
        Employeedto updatedemployee=employeeservice.updateEmployee(employeeId,employeedto);
        return ResponseEntity.ok(updatedemployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer employeeId){
         employeeservice.deleteEmployee(employeeId);
         return ResponseEntity.ok("deleted");
    }

    @GetMapping("/all")
 public ResponseEntity<List<Employeedto>> getAllEmployee(){
 List<Employeedto> employeeall=employeeservice.getAllEmployee();
     return ResponseEntity.ok(employeeall);
 }
 @DeleteMapping("/deleteall")
 public ResponseEntity<String> deleteAllEmployee(){
         employeeservice.deleteAllEmployee();
         return ResponseEntity.ok("deleted all");
 }
}
