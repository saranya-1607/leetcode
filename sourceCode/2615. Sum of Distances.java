//Brute Force:
  //TC : O(n^2)
  //SC : O(N)
  class Solution {
    public long[] distance(int[] nums) {
       int n=nums.length;
       long arr[] = new long[n];
       for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<n;j++){
            if(i != j && nums[i]==nums[j]){
                sum += Math.abs(i-j);
            }
        }
        arr[i] =sum;
       }
       return arr;
    }
}

//optimal SOlution :
