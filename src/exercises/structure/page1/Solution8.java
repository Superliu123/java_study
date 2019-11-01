package exercises.structure.page1;

import java.util.Scanner;

/**
 * @description: 输入一个字符串，从第一个非空字符开始截取连续的数字（包含正负号且只能有一个）并输出，若超出int范围[-2^31, 2^31 - 1]则输出int类型的最大值或最小值，其它情况则输出0
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 21:48
 */
public class Solution8 {


    //执行用时 :4 ms, 在所有 Java 提交中击败了86.07%的用户
    //内存消耗 :36.1 MB, 在所有 Java 提交中击败了85.08%的用户
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null || "".equals(str)) {
            return 0;
        }
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        if (chars[0] == '-' || chars[0] == '+') {
            stringBuffer.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] < 48 || chars[i] > 57) {
                    break;
                }
                stringBuffer.append(chars[i]);
            }
            if (stringBuffer.length() == 1) {
                return 0;
            }
        } else {
            for (char c: chars) {
                if (c < 48 || c > 57) {
                    break;
                }
                stringBuffer.append(c);
            }
        }
        long result;
        try {
            result= Long.parseLong(stringBuffer.toString());
        } catch (NumberFormatException e) {
            if (stringBuffer.length() == 0) {
                return 0;
            } else {
                return stringBuffer.indexOf("-") >= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return (int)Math.max(Integer.MIN_VALUE, Math.min(Integer.MAX_VALUE, result));

    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 10){
            System.out.println("s：");
            String s = scanner.next();
            System.out.println("结果：" + solution8.myAtoi(s));
            i++;
        }
    }
}
