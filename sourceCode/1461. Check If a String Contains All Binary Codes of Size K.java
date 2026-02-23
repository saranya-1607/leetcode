//////////////////////brute force/////////////////////////
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String subs = s.substring(i,i+k);
            set.add(subs);
        }
        int required = (int)Math.pow(2,k);
        return set.size()==required;
    }
}
