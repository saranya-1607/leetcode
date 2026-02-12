class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxLen =0;

        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            int distinct =0;
            int maxFreq =0;
            for(int j=i;j<n;j++){
                int index =s.charAt(j)-'a';
                if(freq[index]==0){
                    distinct++;
                }
                freq[index]++;
                maxFreq = Math.max(maxFreq,freq[index]);
                int len = j-i+1;
                if(len == distinct * maxFreq){
                    maxLen = Math.max(maxLen,len);
                }
            }
        }
        return maxLen;
    }
}
