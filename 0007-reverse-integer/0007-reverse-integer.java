class Solution {
    public int reverse(int x) {
        int sign=1;
        if(x<0){
            sign=-1;
            x=-x;
        }
        long rev=0;
        while(x>0){
            int lastDigit=x%10;
            
            rev=rev*10+lastDigit;
            x=x/10;
        }   
        
        if(rev> Integer.MAX_VALUE || rev <Integer.MIN_VALUE){
            return 0;
        }
return (int)rev*sign;
        
    }
}