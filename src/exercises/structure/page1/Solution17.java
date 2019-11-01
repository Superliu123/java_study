package exercises.structure.page1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 电话号码的字母组合
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-31 16:45
 */
public class Solution17 {

    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) return new ArrayList<>();
        char[] nums = digits.toCharArray();
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case '2': s[i] = "abc";break;
                case '3': s[i] = "def";break;
                case '4': s[i] = "ghi";break;
                case '5': s[i] = "jkl";break;
                case '6': s[i] = "mno";break;
                case '7': s[i] = "pqrs";break;
                case '8': s[i] = "tuv";break;
                case '9': s[i] = "wxyz";break;
                default: break;
            }
        }
        return getList(s, new ArrayList<>(), "", 0);
    }

    //递归算法优点耗时少，缺点内存占用大
    public List<String> getList(String[] s, List<String> list, String temp, int n) {
        if (n < s.length - 1) {
            char[] chars = s[n].toCharArray();
            for (int i = 0; i < chars.length; i++) {
                list = getList(s, list, temp + chars[i], n+1);
            }
            n++;
        }else {
            char[] chars = s[n].toCharArray();
            for(int j=0;j<chars.length;j++){
                list.add(temp+chars[j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        System.out.println(solution17.letterCombinations("23"));
    }
}
