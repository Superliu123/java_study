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
