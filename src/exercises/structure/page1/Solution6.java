package exercises.structure.page1;

import java.util.Scanner;

/**
 * @description: 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *               输入: s = "LEETCODEISHIRING", numRows = 4
 *              输出: "LDREOEIIECIHNTSG"
 *              解释:
 *            1  L     D     R
 *            4  E   O E   I I
 *            9  E C   I H   N
 *            14 T     S     G
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-10 14:51
 */
public class Solution6 {

    //执行用时 :9 ms, 在所有 Java 提交中击败了89.26%的用户
    //内存消耗 :37 MB, 在所有 Java 提交中击败了99.20%的用户
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= numRows) {
            return s;
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        int bei = numRows + numRows - 2;
        char[][] stringArray = new char[numRows][2 * length/bei + 2];
        int row;
        int column;
        for (int i = 1; i <= length; i++) {
            //第几行
            if (i % bei == 0) {
                row = 2;
            } else {
                row = i % bei < numRows ? i % bei : 2 * numRows - i % bei;
            }
            //第几列
            if (i % bei > numRows) {
                column = 2 * (i / bei) + 2;
            } else if (i % bei == 0) {
                column = 2 * (i / bei);
            } else {
                column = 2 * (i / bei) + 1;
            }
            stringArray[row-1][column - 1] = chars[i-1];
            System.out.println("row: " + (row-1) + "  column: " + (column - 1) + "     " + chars[i-1]);
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < 2 * length/bei + 2; j++) {
                if (stringArray[i][j] != '\u0000') {
                    result = result.append(stringArray[i][j]);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int i = 0;
        while(i < 10){
            Scanner in = new Scanner(System.in);
            System.out.printf("s：");
            String s = in.next();
            System.out.print("numRows: ");
            int numRows = in.nextInt();
            System.out.println(solution6.convert(s,numRows));
            i++;
        }
    }
}
