class Solution {
    public String reverseWords(String s) {
       String arr[] = s.split(" ");
       int l = arr.length;
       String s2 = "";
       for(int i=0; i<l; i++){
        for(int j=arr[i].length()-1; j>=0; j--){
           s2 = s2 + arr[i].charAt(j);
           
        }
        if(i !=l-1){
        s2= s2 +" ";
        }
       } return s2;
    }
}