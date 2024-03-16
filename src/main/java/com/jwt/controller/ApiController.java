package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.ApiResponse;
import com.jwt.service.MatchService;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private MatchService matchService;

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/task1")
    public ResponseEntity<?> task1() {
        // Implement logic to retrieve values from token
        return ResponseEntity.ok(new ApiResponse("Task 1 completed"));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/task2")
    public ResponseEntity<?> task2() {
        // Implement logic to fetch football matches and calculate draw
        int drawnMatchesCount = matchService.getDrawnMatchesCount(2011);
        return ResponseEntity.ok(new ApiResponse("Task 2 completed. Drawn matches count: " + drawnMatchesCount));
    }
}
