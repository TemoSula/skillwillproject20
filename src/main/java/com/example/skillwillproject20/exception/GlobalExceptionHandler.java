package com.example.skillwillproject20.exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler{


    @ExceptionHandler
    protected ResponseEntity<Object> handleRuntTimeException(CustomException ex)
    {
    ExceptionBody exceptionBody = new ExceptionBody(ex.getClass().getSimpleName(),System.currentTimeMillis());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionBody);
    }




}
