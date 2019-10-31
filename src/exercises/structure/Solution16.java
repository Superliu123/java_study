/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-10-31 15:02
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 给定一个数组返回三个数之和最接近目标值
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-31 15:02
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        if (nums[0] + nums[1] + nums[2] >= target) return nums[0] + nums[1] + nums[2];
        int sumCloseset = nums[0] + nums[1] + nums[2];
        int closest = target - sumCloseset;
        //中心思想就是双指针移动
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]){ //防止重复
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[l] + nums[r] + nums[i];
                    if (sum == target) {
                        return sum;
                    } else if (sum < target) {
                        if (target - sum < closest) {
                            closest = target - sum;
                            sumCloseset = sum;
                        }
                        while (l < r && nums[l] == nums[l+1]) l++; //防止重复
                        l++;
                    } else {
                        if (sum - target < closest) {
                            closest = sum - target;
                            sumCloseset = sum;
                        }
                        while (l < r && nums[r] == nums[r-1]) r--; //防止重复
                        r--;
                    }
                }
            }
        }
        return sumCloseset;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,8,16,32,64,128};
        int target = 83;
        Solution16 solution16 = new Solution16();
        System.out.println(solution16.threeSumClosest(nums, target));
    }
}
