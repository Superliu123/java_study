package test;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-15 18:30
 */
public class NumberTest {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE) + "   " + Integer.toBinaryString(Integer.MIN_VALUE).length());
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE) + "   " + Integer.toBinaryString(Integer.MAX_VALUE).length());
        int a = 9;
        System.out.println("之前: " + Integer.toBinaryString(a) + "   " + a);
        a = a << 28;
        System.out.println("之后: " + Integer.toBinaryString(a) +  "   " + Integer.toBinaryString(a).length() + "   " + a);
    }
}
