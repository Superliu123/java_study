/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-16 18:48
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
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
