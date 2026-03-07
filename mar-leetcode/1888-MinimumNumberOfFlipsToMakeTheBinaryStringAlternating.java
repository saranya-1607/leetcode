//////////////////////////brute force///////////////////////
Brute Force TC: O(n^2) i.e O(length)
  SC:O(n*2)

  
class Solution {
    public int minFlips(String s) {
        int n =s.length();
        s=(s+s); //so total len =2*n
            /////alternating string/////
        ///////0101010....= s1
        ///////1010101....= s2
        
        //Using += on String inside a loop is very slow in Java.
        // so we use StringBuilder
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();  // expected char strings
        for(int i=0;i<2*n;i++){
            s1.append(i%2==0 ?'0' :'1');
            s2.append(i%2==0 ?'1' : '0');
        }

        //sliding window use//
         int result =Integer.MAX_VALUE;
         int flip1 = 0;
         int flip2 = 0;
         int i=0;
         int j=0;
         while(j<2*n){
            if(s.charAt(j) != s1.charAt(j)){
                flip1++;
            }
            if(s.charAt(j) != s2.charAt(j)){
                flip2++;
            }
            if(j-i+1 > n){ //shrink the window from left
               if(s.charAt(i) != s1.charAt(i)) flip1--;
               if(s.charAt(i) != s2.charAt(i)) flip2--;

               i++;
            }
            if(j-i+1 == n){
            result =Math.min(result,Math.min(flip1,flip2));
         }
          j++;
            
         }
         return result;
        
    }
}
////////////////////////////optimal solution///////////////////

//Approach-2 (Sliding Window + without modifying input)
//T.C : O(2*n) ~= O(n)
//S.C : O(2*n) for s1 and s2

class Solution {
    public int minFlips(String s) {
        int n =s.length();
            //alternating string
        //  010101010....= s1
        //  1010101....= s2
        
        //Using += on String inside a loop is very slow in Java.
        // so we use StringBuilder
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();  // expected char strings
        for(int i=0;i<2*n;i++){
            s1.append(i%2==0 ?'0' :'1');
            s2.append(i%2==0 ?'1' : '0');
        }

        //sliding window use//
         int result =Integer.MAX_VALUE;
         int flip1 = 0;
         int flip2 = 0;
         int i=0;
         int j=0;
         while(j<2*n){
            if(s.charAt(j%n) != s1.charAt(j))  flip1++;
            if(s.charAt(j%n) != s2.charAt(j))  flip2++;


            if(j-i+1 > n){ //shrink the window from left
               if(s.charAt(i%n) != s1.charAt(i)) flip1--;
               if(s.charAt(i%n) != s2.charAt(i)) flip2--;

               i++;
            }
            
            if(j-i+1 == n){
            result =Math.min(result,Math.min(flip1,flip2));
         }
          j++;
            
         }
         return result;
        
    }
}

//Approach-3 (Sliding Window + without modifying input)
//T.C : O(2*n) ~= O(n)
//S.C : O(1)

class Solution {
    public int minFlips(String s) {
        int n =s.length();
            //alternating string
        //  010101010....= s1
        //  1010101....= s2
        
    

        //sliding window use//
         int result =Integer.MAX_VALUE;
         int flip1 = 0;
         int flip2 = 0;
         int i=0;
         int j=0;
         while(j<2*n){

            char expectedChars1 = (j%2==1 ? '0' :'1');
            char expectedChars2 = (j%2==1 ? '1' : '0');


            if(s.charAt(j%n) != expectedChars1)  flip1++;
            if(s.charAt(j%n) != expectedChars2)  flip2++;


            if(j-i+1 > n){ //shrink the window from left

            expectedChars1 = (i%2==1 ? '0' :'1');
            expectedChars2 = (i%2==1 ? '1' :'0');
               if(s.charAt(i%n) != expectedChars1) flip1--;
               if(s.charAt(i%n) != expectedChars2) flip2--;

               i++;
            }

            if(j-i+1 == n){
            result =Math.min(result,Math.min(flip1,flip2));
         }
          j++;
            
         }
         return result;
        
    }
}


