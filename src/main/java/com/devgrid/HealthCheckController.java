package com.devgrid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping(value = "/alive", method = RequestMethod.GET)
    public ResponseEntity<String> isAlive() {
        LOGGER.info("Received a health check!");
        return ResponseEntity.ok().body(new Date().toString() + " Yes, I am alive.");
    }

}
