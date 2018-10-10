package org.learn.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 计算方式枚举
 */
@Getter
@AllArgsConstructor
public enum CalculateTypeEnum {
    ADD("0", "加法"),
    SUBTRACTION("1", "减法");

    private String code;

    private String desc;

}
