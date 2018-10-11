package org.learn.factory.interfaces.impl;

import org.learn.factory.interfaces.SingleNumerMath;

import java.math.BigDecimal;

/**
 * 绝对值
 */
public class AbsoluteMath implements SingleNumerMath {
    @Override
    public BigDecimal change(BigDecimal num) throws Exception {
        if (num == null) {
            throw new IllegalArgumentException("参数为空");
        }
        return new BigDecimal(Math.abs(num.doubleValue()));
    }


}
