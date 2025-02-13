package com.pg.employee.data.repository;

import com.pg.employee.data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Employee,Integer> {

}
