/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-17 15:44
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.singletion;

import java.math.BigDecimal;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-17 15:44
 */
public class Test {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(12.5);
        System.out.println(b.toEngineeringString() + "   " + b.toPlainString() + "  " + b.toString());

        String s = "中国";
        byte[] a = s.getBytes();
        System.out.println(s.length() + "  " + a.length);
    }
}
