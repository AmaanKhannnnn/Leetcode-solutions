class Solution {
    public String truncateSentence(String s, int k) {
        String m = "";
       String []arr = s.split(" ");
       int l = arr.length;
       for(int i=0; i<k; i++){
           m = m+arr[i];
           if(i<k-1)
           m=m+" ";
        }
       return m;
    }
}