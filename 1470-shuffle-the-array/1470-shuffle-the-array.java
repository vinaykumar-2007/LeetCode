class Solution {
    public int[] shuffle(int[] nums, int n) {

        int mid = nums.length / 2;

        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[nums.length - mid];

        // first half
        for (int i = 0; i < mid; i++) {
            firstHalf[i] = nums[i];
        }

        // second half
        for (int i = mid; i < nums.length; i++) {
            secondHalf[i - mid] = nums[i];
        }

        int newarr[] = new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            newarr[i]=firstHalf[j];
            newarr[i+1] = secondHalf[j];
            j++;
        }
        return newarr;
    }
}