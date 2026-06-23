class Solution {
    public int maximumWealth(int[][] accounts) {
        int w = 0;
        int l = accounts.length;
        int m = accounts[0].length;
        for(int i=0;i<l;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += accounts[i][j];
            }
            if(sum>w) w = sum ;
        }

        return w;
    }
}