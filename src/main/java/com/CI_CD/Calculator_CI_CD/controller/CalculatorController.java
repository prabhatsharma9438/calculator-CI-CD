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

    @GetMapping("/mul")
    public String mul(@RequestParam int a, @RequestParam int b) {
        return "mul is : "+calculatorService.mul(a, b);
    }

    @GetMapping("/get")
    public String intro() {
        return "my name is prabhat sharma i made this calculator api lets see";
    }

    @GetMapping("/rahul")
    public String rahul() {
        return "hiii my name is rahul";
    }




}
