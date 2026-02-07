class Solution {
    public int minimumDeletions(String s) {
        int bcnt =0;
        int deletions =0;
        for(char ch : s.toCharArray()){
            if(ch=='b'){
                bcnt++;
            }else{
                deletions =Math.min(deletions+1,bcnt);
            }
        }
        return deletions;
    }
}
