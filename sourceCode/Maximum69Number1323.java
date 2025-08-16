1323. Maximum 69 Number —
🔍 Problem Recap
We are given a number that contains only the digits 6 and 9.
We can change at most one digit:

If it’s a 6, we can make it 9.
If it’s a 9, we can make it 6.
Our goal is to get the biggest possible number after making at most one change.

💡 Intuition
The number will be largest if we change the first 6 we see (from left to right) into a 9.
Why?

Digits on the left have a higher value than digits on the right.
Changing a leftmost digit affects the number more than changing any digit on the right.
📝 Approach
Convert the number into characters so we can look at each digit easily.
Scan from left to right:
If we find a '6', change it to '9'.
Stop immediately after the first change (since we can only change one digit).
Convert the characters back into a number.
Return that number.
📌 Example
Input: 9669
Step 1: Convert to ['9', '6', '6', '9']
Step 2: First digit is 9 → skip
Step 3: Second digit is 6 → change it to 9
Step 4: Now it’s ['9', '9', '6', '9'] → 9969
That’s our answer.
 Complexity Analysis
Time Complexity: O(n) — we scan the number’s digits once (where n is the number of digits).
Space Complexity: O(n) — for storing the digits as a character array.
(If we used a math-only method, we could make space O(1))

||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
class Maximum69Number1323{
    public int maximum69Number(int num){
        char[] s =String.valueOf(num).toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]=='6'){
                s[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(s));
    }
    public static void main(String[] args){
      int n =6996;
      Maximum69Number1323 obj = new Maximum69Number1323();
        System.out.println(obj.maximum69Number(n));
    }
}
