class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sign=1;
        if(x<0){
          sign=-1;
          x=-x;
        }
        int rev=0;
        while(x>0){
            int lastdigit=x%10;
            rev=rev*10+lastdigit;
            x=x/10;

        }
        if( n*sign==rev*sign || n==rev){
            return true;
        }
        else{
           return false;
        }
        
    }
}