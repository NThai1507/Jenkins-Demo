package com.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class HomeController {

    @GetMapping(value = "well-come/{user-name}")
    public ResponseEntity<String> wellCome(
            @PathVariable(value = "user-name") String userName) {
        return ResponseEntity.ok("Well Come " + userName);
    }

   @GetMapping(value = "cicd")
    public ResponseEntity<String> cicdTest(
            @PathVariable(value = "user-name") String userName) {
        return ResponseEntity.ok("Well Come to my CICD testing");
    }

}
