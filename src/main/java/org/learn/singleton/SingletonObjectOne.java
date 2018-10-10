package org.learn.singleton;

/**
 * 单例 最简单的没有任何控制
 */
public class SingletonObjectOne {
    private static SingletonObjectOne singletonObjectOne;

    private SingletonObjectOne(){}

    public static SingletonObjectOne getInstance(){
        if(singletonObjectOne == null) {
            singletonObjectOne = new SingletonObjectOne();
        }
        return singletonObjectOne;
    }
}
