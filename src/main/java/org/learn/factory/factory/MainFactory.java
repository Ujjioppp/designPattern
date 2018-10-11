package org.learn.factory.factory;

import org.learn.factory.interfaces.Calculator;
import org.learn.factory.interfaces.SingleNumerMath;

/**
 * 各工厂父类
 */
public interface MainFactory {
    Calculator getCalculator(String calculateType) throws Exception;

    SingleNumerMath getMath(String mathType) throws Exception;
}
