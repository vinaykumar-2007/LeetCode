class Solution {
    public boolean isPalindrome(int x) {
        int d = x;
        int rev = 0;
        while(d>0){
            int digit = d % 10;

            if(rev > Integer.MAX_VALUE && rev < Integer.MIN_VALUE ){
                return false;
            }

            rev = rev*10 + digit;
            d /= 10;

        }
        if (x == rev ){
            return true;
        }else{
            return false;
        }
    }
}