class Solution {
    public int findPermutationDifference(String s, String t) {
        int l = s.length();
        int sum = 0;
       int i =0;
       int j =0;
       while(i<l){
        char ch = s.charAt(i);
        while(j<l){ 
            if(t.charAt(j)==ch){
                int k = j-i;
                k = Math.abs(k);
                sum = sum + k;
                j=0;
                break;
                
            } j++;
        } i++;
       } return sum;
    }
}