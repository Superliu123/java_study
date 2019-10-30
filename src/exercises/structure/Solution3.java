/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-08 21:33
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串(连续) 的长度。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-08 21:33
 */
public class Solution3 {

    //执行用时 :754 ms, 在所有 Java 提交中击败了5.02%的用户
    //内存消耗 :39.4 MB, 在所有 Java 提交中击败了80.63%的用户
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if ("".equals(s) || s == null) {
            return max;
        }
        char[] chars = s.toCharArray();
        //该字符串的最大子序列
        HashSet hashSet = new HashSet(Arrays.asList(s.split("")));
        int sizeMax = hashSet.size();
        hashSet.clear();
        for (int i = 0; i <= chars.length; i++) {
            for (int j = i; j < sizeMax + i && j < chars.length; j++) {
                if (!hashSet.add(chars[j])) {
                    break;
                }
            }
            int len = hashSet.size();
            max = len > max ? len : max;
            hashSet.clear();
        }

        return max;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        long start = System.currentTimeMillis();
        int max = solution3.lengthOfLongestSubstring("123456789");
        long end = System.currentTimeMillis();
        System.out.println("结果：" + max + "  开始：" + end + "  结束：" + start);
    }
}
