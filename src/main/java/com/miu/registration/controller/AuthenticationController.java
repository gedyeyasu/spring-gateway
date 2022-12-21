package com.miu.registration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AuthenticationController {

    @GetMapping
    public ResponseEntity<?> getRoute(){
        return ResponseEntity<String>("Get", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postRoute(@RequestBody){
        return ResponseEntity<String>("Post", HttpStatus.OK);

    }
    @PutMapping
    public ResponseEntity<?> postRoute(@RequestBody){
        return ResponseEntity<String>("Put", HttpStatus.OK);

    }
    @DeleteMapping
    public ResponseEntity<?> postRoute(@RequestBody){
        return ResponseEntity<String>("Delete", HttpStatus.OK);

    }
}
