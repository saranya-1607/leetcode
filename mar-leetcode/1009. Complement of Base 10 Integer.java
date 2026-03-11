class Solution {
    public int bitwiseComplement(int n) {
        int mask=1;
        if(n==0) return 1;
        while(mask<=n){
            mask = mask<<1;
        }
       return (mask-1)^n; 
    }
}
