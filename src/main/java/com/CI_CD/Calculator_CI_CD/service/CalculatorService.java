package com.CI_CD.Calculator_CI_CD.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
}
