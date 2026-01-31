class Solution {
    public String reverseByType(String s) {
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                letters.add(ch);
            }else{
                special.add(ch);
            }
        }
        Collections.reverse(letters);
        Collections.reverse(special);
        StringBuilder ans = new StringBuilder();
        int l=0,spl=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
            ans.append(letters.get(l));
            l++;
        }else{
            ans.append(special.get(spl));
            spl++;
        }
        }
        return ans.toString();
    }
}©leetcode
