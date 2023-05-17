package com.example.webservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

    @GetMapping("/hello")
    public ResponseEntity<String> hello1(){
        return ResponseEntity.ok("hello devops");
    }

    @GetMapping("/")
    public ResponseEntity<String> hello2(){
        return ResponseEntity.ok("hello devops with no params");
    }
}
