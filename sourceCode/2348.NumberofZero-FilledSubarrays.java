class 2348.NumberofZero-FilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
      long ans =0;
      long streak=0;
      for(int num:nums){
        if(num==0){
            streak++;
           ans += streak;
        }
        else{
            streak =0;
        }
      }
      return ans; 
    }
}
