class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }else{
            for(int i = 1;i<=Math.ceil(Math.sqrt(n));i++){
                if(Math.pow(3,i) == n){
                    return true;
                }
            }
        }
        return false;
    }
}