package com.pg.employee.data.Employeeservice.imple;

import com.pg.employee.data.Employeeservice.Employeeservice;
import com.pg.employee.data.Exception.Excep;
import com.pg.employee.data.dto.Employeedto;
import com.pg.employee.data.entity.Employee;
import com.pg.employee.data.mapper.Employeemapper;
import com.pg.employee.data.repository.Repo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public  class imple implements Employeeservice {

    private Repo repo;

    @Override
    public Employeedto createEmployee(Employeedto employeedto) {
        Employee employee= Employeemapper.mapToEmployee(employeedto);
        Employee saved = repo.save(employee);
        return Employeemapper.mapToEmployeedto(saved);
    }

    @Override
    public Employeedto getEmployee(Long employeeId) {
        Employee employee=repo.findById(Math.toIntExact(employeeId)).
                orElseThrow(() -> new Excep("not found:"+employeeId));
        return Employeemapper.mapToEmployeedto(employee);

    }

    @Override
    public Employeedto updateEmployee(Long id, Employeedto employeedto) {
        Employee existingEmployee = repo.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(employeedto, existingEmployee);

        Employee updatedEmployee = repo.save(existingEmployee);
        return Employeemapper.mapToEmployeedto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        Employee employee = repo.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + employeeId));
    repo.deleteById(employeeId);

    }

    @Override
    public List<Employeedto> getAllEmployee() {
      List <Employee> employee=repo.findAll();
        return employee.stream()
                .map(Employeemapper::mapToEmployeedto) // Convert to DTOs
                .collect(Collectors.toList());

    }

    @Override
    public void deleteAllEmployee() {
        repo.deleteAll();
    }

}
