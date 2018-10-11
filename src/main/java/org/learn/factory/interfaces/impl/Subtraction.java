package org.learn.factory.interfaces.impl;

import org.learn.factory.interfaces.Calculator;

import java.math.BigDecimal;

/**
 * 减法计算器
 */
public class Subtraction implements Calculator {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) throws Exception {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("参数为空");
        }
        return num1.subtract(num2);
    }
}
