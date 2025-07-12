package com.CI_CD.Calculator_CI_CD.controller;

import com.CI_CD.Calculator_CI_CD.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "sum is : "+calculatorService.add(a, b);
    }

    @GetMapping("/sub")
    public String sub(@RequestParam int a, @RequestParam int b) {
        return "sub is : "+calculatorService.sub(a, b);
    }




}
