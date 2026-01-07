class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int num=x;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }
       // here we cant check with if because of class type... its need to return to class not to the if statement i am also confused but why we use like this i dont understand. but i see like this condition of if we put here so we retun true or false from this
            return (rev==x) ;
    }
}