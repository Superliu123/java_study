/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-29 14:22
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

/**
 * @description: 整数转罗马数字
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-29 14:22
 */
public class Solution12 {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] luo = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder lm = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                lm.append(luo[i]);
            }
        }
        return lm.toString();
    }

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(1000));
    }
}
