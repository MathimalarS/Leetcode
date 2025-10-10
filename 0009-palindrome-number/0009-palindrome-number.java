class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int temp=x;
        while(temp!=0)
        {
            if(temp<0) return false;
            else
            {
                int digit=temp%10;
                reverse=reverse*10+digit;
                temp/=10;
            }
        }
        return x==reverse;
    }
}