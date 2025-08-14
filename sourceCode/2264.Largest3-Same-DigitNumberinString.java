class 2264.Largest3-Same-DigitNumberinString {
    public static void main(String[] args){
        String num ="6777133339";
        String largest ="";
        for(int i=0;i<=num.length()-3;i++){
            String sub = num.substring(i,i+3);
            if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
                if(largest.equals("") || sub.compareTo(largest)>0){
                    largest = sub;
                }
            }
        }
        System.out.println(largest);
    }
}
//ANOTHER EFFICIENT SOULTION;
class Solution {
    public String largestGoodInteger(String num) {
        String[] numbers = {"999","888","777","666","555","444","333","222","111","000"};
        for (String s : numbers) {
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }
}

//ANOTHER EFFICIENT SOLUTION
