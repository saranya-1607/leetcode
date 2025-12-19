class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res =0;
        int prefSum =0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefSum += nums[i];
            
            if(hm.containsKey(prefSum-k)){
            res += hm.get(prefSum-k);
            }
            hm.put(prefSum,hm.getOrDefault(prefSum,0)+1);
        }
        return res;
    }
}
