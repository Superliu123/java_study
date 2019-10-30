/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-10 22:51
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

import java.util.Scanner;

/**
 * @description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 22:51
 */
public class Solution9 {


    //执行用时 :11 ms, 在所有 Java 提交中击败了90.28%的用户
    //内存消耗 :36.4 MB, 在所有 Java 提交中击败了96.02%的用户
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 10){
            System.out.println("s：");
            int s = scanner.nextInt();
            System.out.println("结果：" + solution9.isPalindrome(s));
            i++;
        }
    }
}
