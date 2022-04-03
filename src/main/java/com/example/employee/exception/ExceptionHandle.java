package com.example.employee.exception;

import com.example.employee.model.DataError;
import com.example.employee.model.GlobalError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

        @ExceptionHandler({AgeException.class})
        public ResponseEntity<DataError> handleAgeException(AgeException e)
        {
                return new ResponseEntity<>(new DataError("Age Exception","Age Exception msg"),
                        HttpStatus.BAD_REQUEST);

        }

        @ExceptionHandler({SalaryException.class})
        public ResponseEntity<DataError> handleSalaryException(SalaryException e)
        {
                return new ResponseEntity<>(new DataError("Salary Exception","Salary Exception msg"),
                        HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler({FizzException.class})
        public ResponseEntity<GlobalError> FizzException(FizzException e)
        {
                return new ResponseEntity<>(new GlobalError("Fizz Exception","Fizz Exception msg"),
                        HttpStatus.BAD_REQUEST);

        }
        @ExceptionHandler({BuzzException.class})
        public ResponseEntity<GlobalError> handleAgeException(BuzzException e)
        {
                return new ResponseEntity<>(new GlobalError("buzz Exception","buzz Exception msg"),
                        HttpStatus.INTERNAL_SERVER_ERROR);

        }
        @ExceptionHandler({FizzBuzzException.class})
        public ResponseEntity<GlobalError> handleAgeException(FizzBuzzException e)
        {
                return new ResponseEntity<>(new GlobalError("fizzbuzz Exception","fizzbuzz Exception msg"),
                        HttpStatus.PROXY_AUTHENTICATION_REQUIRED);

        }
}
