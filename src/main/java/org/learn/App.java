package org.learn;

import org.learn.factory.enums.CalculateTypeEnum;
import org.learn.factory.enums.FactoryTypeEnum;
import org.learn.factory.enums.SingleNumberMathTypeEnum;
import org.learn.factory.factory.CalculatorFactory;
import org.learn.factory.factory.MainFactory;
import org.learn.factory.interfaces.Calculator;
import org.learn.factory.interfaces.SingleNumerMath;
import org.learn.factory.producer.FactoryProducer;
import org.learn.singleton.SingletonObjectEnum;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();

        //单例
        app.testSingleton();

        drawSplitLine();

        //工厂
        app.testFactory();

        drawSplitLine();

        //抽象工厂
        app.testAbstractFactory();

    }

    /**
     * 测试单例
     */
    private void testSingleton() {
        System.out.println("单例");
        SingletonObjectEnum.SingletonObjectThree singletonObjectThree1 = SingletonObjectEnum.INSTANCE.getInstance();
        SingletonObjectEnum.SingletonObjectThree singletonObjectThree2 = SingletonObjectEnum.INSTANCE.getInstance();
        System.out.println(singletonObjectThree1 == singletonObjectThree2);
    }

    /**
     * 测试工厂
     */
    private void testFactory() throws Exception {
        System.out.println("工厂");
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = BigDecimal.ONE;
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator calculator1 = calculatorFactory.getCalculator(CalculateTypeEnum.ADD.getCode());
        Calculator calculator2 = calculatorFactory.getCalculator(CalculateTypeEnum.SUBTRACTION.getCode());
        System.out.println(calculator1.calculate(num1, num2));
        System.out.println(calculator2.calculate(num1, num2));
    }

    /**
     * 测试抽象工厂
     */
    private void testAbstractFactory() throws Exception {
        System.out.println("抽象工厂");
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = BigDecimal.ONE;
        MainFactory mainFactory1 = FactoryProducer.getFactory(FactoryTypeEnum.Calculate.getCode());
        Calculator calculator = mainFactory1.getCalculator(CalculateTypeEnum.ADD.getCode());
        System.out.println(calculator.calculate(num1, num2));

        MainFactory mainFactory2 = FactoryProducer.getFactory(FactoryTypeEnum.Math.getCode());
        SingleNumerMath singleNumerMath = mainFactory2.getMath(SingleNumberMathTypeEnum.NEGATION.getCode());
        System.out.println(singleNumerMath.change(num2));
    }


    private static void drawSplitLine() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
