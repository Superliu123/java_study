package exercises.structure.page1;

/**
 * @description: 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *               '.' 匹配任意单个字符
 *               '*' 匹配零个或多个前面的那一个元素
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 23:40
 */
public class Solution10 {

    public boolean isMatch(String s, String p) {
        if (p == null) return false;
        else if (s == null) return true;
        else {
            if (p.contains(".*")) return true;
            else {
                char[] ss = s.toCharArray();
                char[] pp = p.toCharArray();
                for (int i = 0; i < ss.length;) {
                    for (int j = i + 1; j < ss.length; j++) {
                        if (ss[i] == ss[j]) {
                            ss[j] = 0;
                        }
                    }
                }
            }
        }
        return false;
    }
}
