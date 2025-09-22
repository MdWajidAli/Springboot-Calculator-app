package com.calculator.project.Calculator.project.dto;

import java.math.BigDecimal;

public class OperationsResponse {
    private String operation;
    private BigDecimal a ;
    private BigDecimal b ;
    private BigDecimal result ;

    public OperationsResponse() {}

    public OperationsResponse(String operation, BigDecimal a, BigDecimal b, BigDecimal result) {
        this.operation = operation;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public BigDecimal getA() {
        return a;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }
}
