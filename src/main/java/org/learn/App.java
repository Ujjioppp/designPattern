package org.learn;

import org.learn.singleton.SingletonObjectEnum;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //单例
        SingletonObjectEnum.SingletonObjectThree singletonObjectThree1 = SingletonObjectEnum.INSTANCE.getInstance();
        SingletonObjectEnum.SingletonObjectThree singletonObjectThree2 = SingletonObjectEnum.INSTANCE.getInstance();
        System.out.println(singletonObjectThree1 == singletonObjectThree2);



    }
}
