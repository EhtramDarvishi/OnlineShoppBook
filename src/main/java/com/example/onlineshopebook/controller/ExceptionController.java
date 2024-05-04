package com.example.onlineshopebook.controller;

import com.example.onlineshopebook.dto.response.ExceptionResponse;
import com.example.onlineshopebook.exception.RuleException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(RuleException.class)
    public ResponseEntity<List<ExceptionResponse>> handlerRuleException(RuleException ruleException) {
        return ResponseEntity.status(400).body(Collections.singletonList(ruleExceptionToExceptionResponse(ruleException)));
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ExceptionResponse>> handlerMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
        return ResponseEntity.status(400)
                .body(MethodArgumentNotValidExceptionToExceptionResponse(methodArgumentNotValidException));
    }

    private ExceptionResponse ruleExceptionToExceptionResponse(RuleException ruleException) {
        return ExceptionResponse.builder()
                .Message(ruleException.getMessage())
                .code("402")
                .build();
    }

    private List<ExceptionResponse> MethodArgumentNotValidExceptionToExceptionResponse(MethodArgumentNotValidException methodArgumentNotValidException) {
        return methodArgumentNotValidException.getFieldErrors().stream().map(error -> ExceptionResponse.builder()
                .Message(error.getDefaultMessage())
                .code(error.getField())
                .build()).collect(Collectors.toList());

    }
}
