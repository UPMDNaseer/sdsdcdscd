package com.jwt.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JwtAuthenticationException {

    @ExceptionHandler(JwtAuthenticationException.class)
    public ResponseEntity<?> handleAuthenticationException(JwtAuthenticationException ex) {
        return ResponseEntity.badRequest().body( new ApiResponse(ex.getMessage()));
    }
}
