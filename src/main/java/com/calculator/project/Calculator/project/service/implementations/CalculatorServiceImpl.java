package com.calculator.project.Calculator.project.service.implementations;

import com.calculator.project.Calculator.project.service.CalculatorService;
import com.calculator.project.Calculator.project.exception.BadRequestException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    int DIVIDE_SCALE = 10;

    @Override
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    @Override
    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    @Override
    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        if(b.compareTo(BigDecimal.ZERO) == 0){
            throw new BadRequestException("Division by zero is not possible");
        }
        try {
            return a.divide(b, DIVIDE_SCALE, RoundingMode.HALF_UP).stripTrailingZeros();
        }catch (ArithmeticException ex){
            return a.divide(b, DIVIDE_SCALE,RoundingMode.HALF_UP).stripTrailingZeros();
        }
    }
}
