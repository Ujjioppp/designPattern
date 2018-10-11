package org.learn.factory.factory;

import org.apache.commons.lang3.StringUtils;
import org.learn.factory.enums.SingleNumberMathTypeEnum;
import org.learn.factory.interfaces.Calculator;
import org.learn.factory.interfaces.SingleNumerMath;
import org.learn.factory.interfaces.impl.AbsoluteMath;
import org.learn.factory.interfaces.impl.NegationMath;

/**
 * 单个数字处理工厂
 */
public class SingleNumberMathFactory implements MainFactory {
    @Override
    public Calculator getCalculator(String calculateType) throws Exception {
        return null;
    }

    @Override
    public SingleNumerMath getMath(String mathType) throws Exception {
        SingleNumerMath singleNumerMath;
        if (StringUtils.equals(SingleNumberMathTypeEnum.ABSOLUTE.getCode(), mathType)) {
            singleNumerMath = new AbsoluteMath();
        } else if (StringUtils.equals(SingleNumberMathTypeEnum.NEGATION.getCode(), mathType)) {
            singleNumerMath = new NegationMath();
        } else {
            throw new IllegalArgumentException("未识别的处理类型");
        }
        return singleNumerMath;
    }
}
