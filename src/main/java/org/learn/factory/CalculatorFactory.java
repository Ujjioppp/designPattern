package org.learn.factory;

import org.apache.commons.lang3.StringUtils;
import org.learn.factory.enums.CalculateTypeEnum;
import org.learn.factory.impl.Addition;
import org.learn.factory.impl.Subtraction;

/**
 * 计算器工厂
 */
public class CalculatorFactory {

    public static Calculator getCalculator(String calculateType) throws Exception {
        Calculator calculator;
        if (StringUtils.equals(CalculateTypeEnum.ADD.getCode(), calculateType)) {
            calculator = new Addition();
        } else if (StringUtils.equals(CalculateTypeEnum.SUBTRACTION.getCode(), calculateType)) {
            calculator = new Subtraction();
        } else {
            throw new IllegalArgumentException("未识别的计算方式");
        }
        return calculator;
    }
}
