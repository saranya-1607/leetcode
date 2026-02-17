class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int hour=0;hour<12;hour++){
            for(int minute=0;minute<60;minute++){
                int totalBits = Integer.bitCount(hour)+Integer.bitCount(minute);
                if(totalBits==turnedOn){
                    ans.add(String.format("%d:%02d",hour,minute));
                }
            }
        }
        return ans;
    }
}
