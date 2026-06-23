class Solution {
    public int getMinIndex(int[] nums ){
        int min = 0;
        int minelement = nums[0];
        int len = nums.length;
        for(int i=1;i<len;i++){
            if(nums[i] < minelement){
                min = i;
                minelement = nums[i];
            }
        }

        return min;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=1;i<=k;i++){
            int min = getMinIndex(nums);
            nums[min] = nums[min] * multiplier;
        }

        return nums;
    }
}