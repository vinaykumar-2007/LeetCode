class Solution {
    public int mostWordsFound(String[] sentences) {
        int m =0;
        for(int i=0;i<sentences.length;i++){
            int count =1;
            String p = sentences[i];
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)==' '){
                    count++;
                }
            }

            if(count> m) m = count;
        }
        return m;
    }
}