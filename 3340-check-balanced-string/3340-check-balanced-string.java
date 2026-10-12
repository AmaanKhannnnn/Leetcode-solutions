class Solution {
    public boolean isBalanced(String num) {
        int l = num.length();
        int odd =0;
        int even =0;
        
        for(int i=0; i<l; i++){
            int k = num.charAt(i)-'0';
            if(i%2==0){
                even = even+k;
            } else {
               odd = odd+k;
            }
        } if(even==odd) {
            return true;
        }
        else {
            return false;
        }

    }
}