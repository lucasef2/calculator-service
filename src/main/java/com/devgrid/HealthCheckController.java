package com.devgrid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @RequestMapping(value = "/alive", method = RequestMethod.GET)
    public ResponseEntity<String> isAlive() {
        return ResponseEntity.ok().body(new Date().toString() + " Yes, I am alive.");
    }

}
