/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-29 14:49
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

/**
 * @description: 罗马数字转整数
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-29 14:49
 */
public class Solution13 {

    public int romanToInt(String s) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] luo = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        char[] c = s.toCharArray();
        int num = 0;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = index; j < c.length; j = luo[i].length() == 1 ? j+1 : j+2) {
                if (j == c.length - 1) {
                    if (luo[i].length() == 1 && luo[i].indexOf(c[j]) == 0) {
                        num += values[i];
                        index++;
                    }
                } else if (luo[i].length() == 2 && luo[i].indexOf(c[j]) == 0 && luo[i].indexOf(c[j+1]) == 1) {
                    num += values[i];
                    index += 2;
                } else if (luo[i].length() == 1 && luo[i].indexOf(c[j]) == 0) {
                    num += values[i];
                    index ++;
                } else {
                    break;
                }

                if (index == c.length) {
                    return num;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("MMM"));
    }
}
