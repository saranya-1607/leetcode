class Solution {
    public int minRemoval(int[] nums, int k) {
       int n =nums.length;
       Arrays.sort(nums);
       int l=0;
       int maxWindow =1;
       for(int r =0;r<n;r++){
        while(nums[r] > (long) k*nums[l]){
            l++;
        }
        maxWindow = Math.max(maxWindow,r-l+1);

       } 
       return n-maxWindow;
    }
}
