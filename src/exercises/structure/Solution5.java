package exercises.structure;

import java.util.Scanner;

/**
 * @description: 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 11:01
 */
public class Solution5 {

    //执行用时 :28 ms, 在所有 Java 提交中击败了64.77%的用户
    //内存消耗 :36.8 MB, 在所有 Java 提交中击败了89.63%的用户
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int max = 0;
        String maxString = "";
        for (int i = 0; i < chars.length - 1; i++) {
            int len1 = 0;
            int len2 = 0;
            //回文数为奇数
            for (int j = 1; j <= i && j < chars.length - i; j++) {
                if (chars[i-j] == chars[i+j]){
                    len1++;
                } else {
                    break;
                }
            }
            //回文数为偶数
            if (chars[i] == chars[i+1]) {
                for (int j = 1; j <= i && j < chars.length - i - 1; j++) {
                    if (chars[i-j] == chars[i+1+j])
                        len2++;
                    else
                        break;
                }
                len2 = 2 * len2 + 2;
            }
            len1 = 2 * len1 + 1;
            if (len1 > 0 && len1 > len2 && max < len1) {
                max = len1;
                maxString = s.substring(i-max/2, i + max/2 + 1);
            } else if( len2 > 0 && len1 < len2 && max < len2){
                max = len2;
                maxString = s.substring(i-max/2+1, i+max/2+1);
            } else if(len1 == 0 && len2 == 0) {
                maxString = chars[0] + "";
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.printf("s：");
            String s = in.next();
            System.out.println(solution5.longestPalindrome(s));
        }
    }
}
