/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-10 21:03
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

/**
 * @description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 21:03
 */
public class Solution7 {

    //执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
    //内存消耗 :33.9 MB, 在所有 Java 提交中击败了78.87%的用户
    public int reverse(int x) {
        long result = 0L;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }

    //执行用时 :3 ms, 在所有 Java 提交中击败了80.19%的用户
    //内存消耗 :34.1 MB, 在所有 Java 提交中击败了78.40%的用户
    public int reverse1(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        StringBuffer resultString = new StringBuffer();
        if (chars[0] != '-') {
            for (int i = chars.length - 1; i >= 0; i--) {
                resultString.append(chars[i]);
            }
        } else {
            resultString.append(chars[0]);
            for (int i = chars.length - 1; i >= 1; i--) {
                resultString.append(chars[i]);
            }
        }

        int result;
        try {
            result = Integer.valueOf(resultString.toString());
        } catch (Exception e) {
           result = 0;
        }
        return result;

    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse1(-1234567));
    }
}
