package com.devgrid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorController.class);

    @Autowired
    private Calculator calculator;

    //localhost:8200/calculator/multiply?a=8&b=4
    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    private Integer sample(@RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b) {
        LOGGER.info("Parameters [" + a + "] + [" + b + "]");
        return calculator.multiply(a, b);
    }


}
