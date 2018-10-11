package org.learn.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 工厂类型枚举
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum  FactoryTypeEnum {
    Calculate("0","计算器"),
    Math("1","数字处理");

    private String code;

    private String desc;


}
