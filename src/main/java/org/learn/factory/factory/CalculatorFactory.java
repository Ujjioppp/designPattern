package org.learn.factory.factory;

import org.apache.commons.lang3.StringUtils;
import org.learn.factory.enums.CalculateTypeEnum;
import org.learn.factory.interfaces.Calculator;
import org.learn.factory.interfaces.SingleNumerMath;
import org.learn.factory.interfaces.impl.Addition;
import org.learn.factory.interfaces.impl.Subtraction;

/**
 * 计算器工厂
 */
public class CalculatorFactory implements MainFactory {

    @Override
    public Calculator getCalculator(String calculateType) throws Exception {
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

    @Override
    public SingleNumerMath getMath(String mathType) throws Exception {
        return null;
    }
}
