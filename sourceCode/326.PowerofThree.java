class 326.PowerofThree
  {
    public boolean isPowerOfThree(int n) {
        if( n<=0){
            return false;
        }
         while(n%3==0){
            n /= 3;
         }
         return n==1;
         
        
    }
}

||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

  class powerof3{
    public static boolean pow(int n){
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n /= 3;
        }
        return n==1;
        
    }
    public static void main(String[] args){
        int n =20;
        System.out.println(pow(n));
    }
}
