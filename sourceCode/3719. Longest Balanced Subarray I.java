//////////////////////////////////////brute force//////////////////////////////
class Solution {
    public int longestBalanced(int[] nums) {
       int maxLen =0;
       for(int i=0;i<nums.length;i++){
        HashSet<Integer> evenNums = new HashSet<>();
        HashSet<Integer> oddNums = new HashSet<>();
        for(int j=i;j<nums.length;j++){
            if(nums[j]%2==0){
                evenNums.add(nums[j]);
            }else{
                oddNums.add(nums[j]);
            }
            if(evenNums.size()==oddNums.size()){
                maxLen =Math.max(maxLen,j-i+1);
            }
        }
       }
       return maxLen; 
    }
}
//////////////////////////////////optimal solution///////////////////////////
