//Q queries
//× D dictionary words
//× N character comparison

//Time	O(Q × D × N)
//Space	O(1) auxiliary / O(Q) output //

class Solution {
    
     public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        for(String q : queries){
            if(canMatch(q,dictionary)){
                res.add(q);
            }
        } 
        return res;
    }
    
     public boolean canMatch(String query,String[] dictionary){
        
        for(String dictWord :dictionary){
            int diffMax=0;
            for(int i=0;i<dictWord.length();i++){
                if(dictWord.charAt(i) != query.charAt(i)){
                    diffMax++;
                }
                if(diffMax>2){
                    break;
                }
            }
            if(diffMax<=2){
                return true;
            }
        }
     return false;
       
    }
}
