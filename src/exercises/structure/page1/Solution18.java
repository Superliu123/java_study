package exercises.structure.page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 四数之和
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-01 11:29
 */
public class Solution18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { //去除重复
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) { //去除重复
                        int l = j + 1;
                        int r = nums.length - 1;
                        int sum = target - nums[i] - nums[j];
                        while (l < r) {
                            if (nums[l] + nums[r] == sum) {
                                lists.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                                while (l < r && nums[l] == nums[l+1]) l++; //去除重复
                                while (l < r && nums[r] == nums[r-1]) r--; //去除重复
                                l++;
                                r--;
                            } else if (nums[l] + nums[r] < sum) {
                                while (l < r && nums[l] == nums[l+1]) l++; //去除重复
                                l++;
                            } else {
                                while (l < r && nums[r] == nums[r-1]) r--; //去除重复
                                r--;
                            }
                        }
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int[] nums = {-4,-1,-1,0,1,2};
        System.out.println(solution18.fourSum(nums, -1));
    }

}
