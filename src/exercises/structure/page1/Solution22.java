package exercises.structure.page1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-04 15:59
 */
public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>(2 * n);
        generate(0,n,0,list,"");
        return list;
    }

    private void generate(int l, int n, int r, List<String> list, String res) {
        if (l > n || r > n) {
            return;
        }
        if (l == n && r == n) {
            list.add(res);
        }
        if (l >= r){
            generate(l+1,n,r,list, res + "(");
            generate(l, n, r+1, list, res + ")");
        }
    }

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.generateParenthesis(3));
    }

}
