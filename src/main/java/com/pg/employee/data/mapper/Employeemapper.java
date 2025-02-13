package com.pg.employee.data.mapper;

import com.pg.employee.data.dto.Employeedto;
import com.pg.employee.data.entity.Employee;

public class Employeemapper {
    public static Employeedto mapToEmployeedto(Employee employee){

        return  new Employeedto(
                employee.getEmpId(),
                employee.getEmpName(),
                employee.getEmpSalary(), // ✅ empSalary comes first
                employee.getEmpPhno()
        );
    }
    public static Employee mapToEmployee(Employeedto employeedto){
        return  new Employee(
                employeedto.getEmpId(),
                employeedto.getEmpName(),
                employeedto.getEmpSalary(), // ✅ empSalary comes first
                employeedto.getEmpPhno()
        );
    }
}
