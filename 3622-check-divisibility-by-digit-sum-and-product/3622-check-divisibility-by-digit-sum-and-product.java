class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int temp1 = n;
        int sum =0;
        int prod =1;
        while(temp>0){
            int k = temp%10;
            sum=sum+k;
            temp=temp/10;
        }
        while(temp1>0){
            int k = temp1%10;
            prod = prod*k;
            temp1=temp1/10;
        }
         int m = prod + sum;
         if(n%m==0) return true;
         else return false;
    }
}