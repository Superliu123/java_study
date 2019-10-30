/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-29 17:34
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

/**
 * @description: 最长公共前缀
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-29 17:34
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int common = Integer.MAX_VALUE;
        int j = 0;
        for(int i = 0; i < strs.length - 1; i++) {
            char[] arr1 = strs[i].toCharArray();
            char[] arr2 = strs[i+1].toCharArray();
            for(; j < Math.min(common, Math.min(arr1.length, arr2.length)); j++) {
                if (arr1[j] != arr2[j]) {
                    break;
                }
            }
            common = j;
        }
        return strs[0].substring(0, common);
    }
}
