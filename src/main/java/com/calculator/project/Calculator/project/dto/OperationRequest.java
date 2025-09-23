package com.calculator.project.Calculator.project.dto;

import java.math.BigDecimal;

public class OperationRequest {
    private BigDecimal a;
    private BigDecimal b;

    public OperationRequest(){}

    public OperationRequest(BigDecimal a, BigDecimal b){
        this.a = a;
        this.b = b;
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
}
