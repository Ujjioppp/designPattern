package org.learn.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 数字处理类型枚举
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SingleNumberMathTypeEnum {
    ABSOLUTE("O", "绝对值"),
    NEGATION("1", "取反");

    private String code;

    private String desc;


}
