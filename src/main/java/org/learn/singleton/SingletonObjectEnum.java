package org.learn.singleton;

/**
 * 单例 这个JVM保证只有一个
 */
public enum SingletonObjectEnum {

    INSTANCE;


    private SingletonObjectThree singletonObjectThree;

    private SingletonObjectEnum() {
        singletonObjectThree = new SingletonObjectThree();
    }

    public SingletonObjectThree getInstance() {
        return singletonObjectThree;
    }

    public class SingletonObjectThree {
        private SingletonObjectThree(){}

        public void print(){
            System.out.println("SingletonThree Instance");
        }
    }
}
