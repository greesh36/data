package com.pg.employee.data.Employeeservice;

import com.pg.employee.data.dto.Employeedto;

import java.util.List;

public interface Employeeservice {
  Employeedto createEmployee(Employeedto employeedto);
  Employeedto getEmployee(Long employeeId);
  Employeedto updateEmployee(Long employeeId,Employeedto employeedto);
   void deleteEmployee(Integer employeeId);
   List<Employeedto> getAllEmployee();
   void deleteAllEmployee();
}
