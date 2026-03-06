///////////////////////////brute force////////////////////////////
class Solution {
    public boolean checkOnesSegment(String s) {
        int cnt=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }else{
                if(cnt>0){
                    if(s.substring(i).contains("1")){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
//Approach-1 (simple traverse and check)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int count = 0;

        int i = 0;
        while(i < n) {
            if(s.charAt(i) == '1') {
                count++;
                while(i < n && s.charAt(i) == '1')
                    i++;
            } else {
                i++;
            }

            if(count > 1)
                return false;
        }
        
        return true;
    }
}
////////////////////////optimal/////////////////////
TC:O(N);
SC:: O(1)
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
