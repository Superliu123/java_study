package exercises.structure;

/**
 * @description: 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。  请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *               你可以假设 nums1 和 nums2 不会同时为空  链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-09 11:27
 */
public class Solution4 {

    //执行用时 :4 ms, 在所有 Java 提交中击败了87.80%的用户
    //内存消耗 :46.7 MB, 在所有 Java 提交中击败了95.54%的用户
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //保证数组2的长度大于等于数组1的长度
        if(nums1.length > nums2.length) {
            int[] temp=nums1;nums1=nums2; nums2=temp;
        }
        int m=nums1.length;
        int n=nums2.length;
        int iMin=0;
        int iMax=m;
        int halfLen=(n+m+1)/2;
        //保证左半部分的最大值小于右半部分最小值
        while(iMin<=iMax) {
            int i=(iMin+iMax)/2;
            int j=halfLen-i;
            if(i<iMax&&nums2[j-1]>nums1[i]) {
                iMin=iMin+1;
            }
            else if(i>iMin&&nums1[i-1]>nums2[j]) {
                iMax=iMax-1;
            }
            else {
                int maxLeft;
                if(i==0) {
                    maxLeft=nums2[j-1];
                }
                else if(j==0) {
                    maxLeft=nums1[i-1];
                }
                else {
                    maxLeft=Math.max(nums1[i-1], nums2[j-1]);
                }
                if((m+n)%2==1) {
                    return maxLeft;
                }
                int minRight;
                if(i==m) {
                    minRight=nums2[j];
                }else if(j==n) {
                    minRight=nums1[i];
                }
                else {
                    minRight=Math.min(nums2[j], nums1[i]);
                }
                return (maxLeft+minRight)/2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9,12,14};
        int[] nums2 = {3,4,6,8,10,11,12,13};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.findMedianSortedArrays(nums1,nums2));
    }
}
