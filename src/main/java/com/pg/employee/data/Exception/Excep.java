package com.pg.employee.data.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Excep extends RuntimeException{
public Excep(String message){
    super(message);
}
}
