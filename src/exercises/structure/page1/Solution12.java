package exercises.structure.page1;

/**
 * @description: 整数转罗马数字
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-29 14:22
 */
public class Solution12 {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] luo = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder lm = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                lm.append(luo[i]);
            }
        }
        return lm.toString();
    }

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(1000));
    }
}
