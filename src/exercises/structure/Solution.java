package exercises.structure;

import java.util.Arrays;

/**
 * @description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *               你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-08 10:15
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,22,4};
        int target = 7;
        Solution solution = new Solution();
        try {
            System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
