class Solution {
    public int maxProfit(int[] nums) {
        int mini = nums[0] , profit = 0;

        for(int i=0;i<nums.length;i++){
            int cost = nums[i] - mini;

            profit = Math.max(profit , cost);

            mini = Math.min(mini , nums[i]);
        }

        return profit;
    }
}