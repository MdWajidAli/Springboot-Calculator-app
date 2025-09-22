package com.calculator.project.Calculator.project.controller;

import com.calculator.project.Calculator.project.dto.OperationsResponse;
import com.calculator.project.Calculator.project.service.CalculatorService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public OperationsResponse add(@RequestParam("a") BigDecimal a,
                                  @RequestParam("b") BigDecimal b){
        BigDecimal result = calculatorService.add(a,b);
        return new OperationsResponse("add", a,b,result);
    }

    @GetMapping("/subtract")
    public OperationsResponse subtract(@RequestParam("a") BigDecimal a,
                                       @RequestParam("b") BigDecimal b){
        BigDecimal result = calculatorService.subtract(a,b);
        return new OperationsResponse("subtract", a,b,result);
    }

    @GetMapping("/multiply")
    public OperationsResponse multiply(@RequestParam("a") BigDecimal a,
                                       @RequestParam("b") BigDecimal b){
        BigDecimal result = calculatorService.multiply(a,b);
        return new OperationsResponse("multiply",a,b,result);
    }

    @GetMapping("/divide")
    public OperationsResponse divide(@RequestParam("a") BigDecimal a,
                                     @RequestParam("b") BigDecimal b) throws BadRequestException {
        BigDecimal result = calculatorService.divide(a,b);
        return new OperationsResponse("divide", a,b,result);

    }

}
