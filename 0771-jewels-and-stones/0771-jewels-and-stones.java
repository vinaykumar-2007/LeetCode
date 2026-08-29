class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<jewels.length();i++){
            char ch = jewels.charAt(i);
            set.add(ch);
        } 

        for(int i=0;i<stones.length();i++){
            char c = stones.charAt(i);

            if(set.contains(c)){
                cnt++;
            }
        }

        return cnt;
    }
}