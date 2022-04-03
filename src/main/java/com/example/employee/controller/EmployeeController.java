package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.model.EmployeeResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping(value = "/checkdata", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> check(@RequestBody Employee e)
    {
        ResponseEntity<EmployeeResponse> response;
          if(e.getAge()>18)
          {
              return new ResponseEntity<>(new EmployeeResponse(e.getId(),true), HttpStatus.OK);
             

          }
        return new ResponseEntity<>(new EmployeeResponse(e.getId(),true), HttpStatus.BAD_REQUEST);


    }


    @PostMapping("/checkdatas")
    public String checks(@RequestBody Employee e)
    {
        ResponseEntity<EmployeeResponse> response;
        if(e.getAge()>18)
        {
            return "Success";
        }

        return "failure";

    }


}
