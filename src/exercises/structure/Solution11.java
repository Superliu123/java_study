package exercises.structure;

/**
 * @description: 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 *               在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 *               找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *               来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/container-with-most-water
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-29 14:05
 */
public class Solution11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int h = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, h * (j - i));
        }
        return max;
    }
}
