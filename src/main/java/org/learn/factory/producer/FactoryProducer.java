package org.learn.factory.producer;

import org.apache.commons.lang3.StringUtils;
import org.learn.factory.factory.CalculatorFactory;
import org.learn.factory.enums.FactoryTypeEnum;
import org.learn.factory.factory.MainFactory;
import org.learn.factory.factory.SingleNumberMathFactory;

/**
 * 工厂producer
 */
public class FactoryProducer {

    public static MainFactory getFactory(String type) throws Exception {
        MainFactory mainFactory = null;
        if (StringUtils.equals(FactoryTypeEnum.Calculate.getCode(), type)) {
            mainFactory = new CalculatorFactory();
        } else if (StringUtils.equals(FactoryTypeEnum.Math.getCode(), type)) {
            mainFactory = new SingleNumberMathFactory();
        } else {
            throw new IllegalArgumentException("未识别的工厂类型");
        }
        return mainFactory;
    }
}
