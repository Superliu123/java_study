package exercises.structure.page1;

import java.util.Stack;

/**
 * @description: 有效的括号:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-01 16:56
 */
public class Solution20 {

    //通过进栈出栈的特点（先进后出）
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (isPiPei(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPiPei(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        String a = "{[()[()]}";
        System.out.println(solution20.isValid(a));
    }
}