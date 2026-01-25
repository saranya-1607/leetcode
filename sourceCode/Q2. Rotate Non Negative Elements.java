class Solution {
    public int[] rotateElements(int[] nums, int k) {
      ArrayList<Integer> nonNeg =new ArrayList<>();
        for(int x : nums){
            if(x >=0){
                nonNeg.add(x);
            }
        }
        int n=nonNeg.size();
        if(n==0) return nums;
        k %= n;
        Collections.rotate(nonNeg,-k);
        
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=nonNeg.get(ind++);
            }
        }
        return nums;
    }
}©leetcode
