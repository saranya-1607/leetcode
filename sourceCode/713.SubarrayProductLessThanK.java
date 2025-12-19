//BRUTE FORCE..............::
class 713.SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            int mul =1;
            for(int j=i;j<nums.length;j++){
                mul *= nums[j];
                if( mul<k){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}


////OPTIMAL SOLUTION:::::::::::::
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      if(k<=1){
        return 0;
      }
      int i =0;
      int mul =1;
      int res =0;
      for(int j=0;j<nums.length;j++){
             mul *= nums[j];
             while(mul>=k){
                mul /= nums[i];
                i++;
             }
             res += j-i+1;
      }
      return res;
    }
}
