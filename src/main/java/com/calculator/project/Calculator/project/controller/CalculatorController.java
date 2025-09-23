package com.calculator.project.Calculator.project.controller;

import com.calculator.project.Calculator.project.dto.OperationRequest;
import com.calculator.project.Calculator.project.dto.OperationsResponse;
import com.calculator.project.Calculator.project.service.CalculatorService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

//    @GetMapping("/add")
//    public OperationsResponse add(@RequestParam("a") BigDecimal a,
//                                  @RequestParam("b") BigDecimal b){
//        BigDecimal result = calculatorService.add(a,b);
//        return new OperationsResponse("add", a,b,result);
//    }

    @PostMapping("/add")
    public OperationsResponse add(@RequestBody OperationRequest request){
        BigDecimal result = calculatorService.add(request.getA(), request.getB());
        return new OperationsResponse("add", request.getA(),request.getB(), result);
    }

//    @GetMapping("/subtract")
//    public OperationsResponse subtract(@RequestParam("a") BigDecimal a,
//                                       @RequestParam("b") BigDecimal b){
//        BigDecimal result = calculatorService.subtract(a,b);
//        return new OperationsResponse("subtract", a,b,result);
//    }

    @PostMapping("/subtract")
    public OperationsResponse subtract(@RequestBody OperationRequest request){
        BigDecimal result = calculatorService.subtract(request.getA(),request.getB());
        return new OperationsResponse("subtract",request.getA(),request.getB(), result);
    }

//    @GetMapping("/multiply")
//    public OperationsResponse multiply(@RequestParam("a") BigDecimal a,
//                                       @RequestParam("b") BigDecimal b){
//        BigDecimal result = calculatorService.multiply(a,b);
//        return new OperationsResponse("multiply",a,b,result);
//    }

    @PostMapping("/multiply")
    public OperationsResponse multiply(@RequestBody OperationRequest request){
        BigDecimal result = calculatorService.multiply(request.getA(),request.getB());
        return new OperationsResponse("multiply",request.getA(),request.getB(), result);
    }

//    @GetMapping("/divide")
//    public OperationsResponse divide(@RequestParam("a") BigDecimal a,
//                                     @RequestParam("b") BigDecimal b) throws BadRequestException {
//        BigDecimal result = calculatorService.divide(a,b);
//        return new OperationsResponse("divide", a,b,result);
//
//    }

    @PostMapping("divide")
    public OperationsResponse divide(@RequestBody OperationRequest request) throws BadRequestException {
        BigDecimal result = calculatorService.divide(request.getA(),request.getB());
        return new OperationsResponse("divide",request.getA(),request.getB(),result);
    }

}
