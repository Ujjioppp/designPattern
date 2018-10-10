package org.learn.singleton;

/**
 * 单例 简单的锁一下
 */
public class SingletonObjectTwo {
    private static SingletonObjectTwo singletonObjectTwo;

    private SingletonObjectTwo() {
    }

    public static synchronized SingletonObjectTwo getInstance() {
        if (singletonObjectTwo == null) {
            singletonObjectTwo = new SingletonObjectTwo();
        }
        return singletonObjectTwo;
    }
}
