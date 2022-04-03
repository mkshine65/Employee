package com.example.employee.controller;

import com.example.employee.exception.AgeException;
import com.example.employee.exception.BuzzException;
import com.example.employee.exception.FizzBuzzException;
import com.example.employee.exception.FizzException;
import com.example.employee.model.Employee;
import com.example.employee.model.EmployeeResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @PostMapping(value = "/checkdata", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> check(@RequestBody Employee e)
    {
        ResponseEntity<EmployeeResponse> response;
         String res=getResponse(e.getAge());
          if(e.getAge()>18)
          {
              return new ResponseEntity<>(new EmployeeResponse(e.getId(),true), HttpStatus.OK);


          }
        return new ResponseEntity<>(new EmployeeResponse(e.getId(),true), HttpStatus.BAD_REQUEST);


    }
    String getResponse(int age)
    {
        if(age<18)
            throw new AgeException("Age Exception");
        return "success";
    }

    @GetMapping("/code/{code}")
    ResponseEntity<String> fizzbuzz(@PathVariable final String code)
    {
        if(code.equals("fizz"))
        {
            throw new FizzException("Fizz exception called");
        }
        else if(code.equals("buzz"))
        {
            throw new BuzzException("Buzz Exception called");
        }
        else if(code.equals("fizzbuzz"))
        {
            throw new FizzBuzzException("Fizzbuzz excepiton called");
        }
        else
            return new ResponseEntity<>("Suceess message",HttpStatus.OK);
    }




}
