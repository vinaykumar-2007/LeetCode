class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }

        Collections.sort(list);

        int l = list.size() / 2;
        
        if(list.size() % 2 != 0){
            return list.get(l);
        }else{
            return ((list.get(l)+list.get(l-1))/2.0);
        }
    }
}