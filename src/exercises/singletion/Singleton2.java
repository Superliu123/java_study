/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-17 11:27
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.singletion;

/**
 * @description: 懒汉式
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-17 11:27
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (instance == null) instance = new Singleton2();
        return instance;
    }

}
