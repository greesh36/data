package com.pg.employee.data.Employeeservice.imple;

import com.pg.employee.data.Employeeservice.Employeeservice;
import com.pg.employee.data.dto.Employeedto;
import com.pg.employee.data.entity.Employee;
import com.pg.employee.data.mapper.Employeemapper;
import com.pg.employee.data.repository.Repo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public  class imple implements Employeeservice {
@Autowired
    private Repo repo;
    @Override
    public Employeedto createEmployee(Employeedto employeedto) {
        Employee employee= Employeemapper.mapToEmployee(employeedto);
        Employee saved = repo.save(employee);
        return Employeemapper.mapToEmployeedto(saved);
    }
}
