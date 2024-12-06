public class houseRobber {
    class Solution {
        public int rob(int[] nums) {
            int n=nums.length;
            return helper(nums,n);
        }
        private int helper(int[] nums,int n){
            if(n<=0){
                return 0;
            }
            else{
                return Math.max(nums[n-1]+helper(nums, n-2), helper(nums, n-1));
            }
        }
    }
}
