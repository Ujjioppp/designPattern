package org.learn.factory.interfaces;

import java.math.BigDecimal;

/**
 * 单数字数学操作
 */
public interface SingleNumerMath {
    BigDecimal change(BigDecimal num) throws Exception;
}
