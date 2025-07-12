package com.CI_CD.Calculator_CI_CD.service;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        int result = service.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSub(){
        int result = service.sub(5, 2);
        assertEquals(3, result);
    }




}
