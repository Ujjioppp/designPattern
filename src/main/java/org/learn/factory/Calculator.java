package org.learn.factory;

import java.math.BigDecimal;

/**
 * 计算器
 */
public interface Calculator {
    BigDecimal calculate(BigDecimal num1, BigDecimal num2) throws Exception;
}
