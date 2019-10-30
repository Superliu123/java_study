package exercises.singletion;

import java.io.Serializable;

/**
 * @description: 饿汉式
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-16 18:48
 */
public class Singleton1 implements Serializable {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public Singleton1 getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
