package com.pg.employee.data.mapper;

import com.pg.employee.data.dto.Employeedto;
import com.pg.employee.data.entity.Employee;

public class Employeemapper {
    public static Employeedto mapToEmployeedto(Employee employee){

        return  new Employeedto(
                employee.getEmpid(),
                employee.getEmpname(),
                employee.getEmpsalary(),
                employee.getEmpphno()
        );
    }
    public static Employee mapToEmployee(Employeedto employeedto){
        return  new Employee(
                employeedto.getEmpid(),
                employeedto.getEmpname(),
                employeedto.getEmpsalary(),
                employeedto.getEmpphno()
        );
    }
}
