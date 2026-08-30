class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i =0; i< s.length()-1; i++){
           char ch = s.charAt(i);
           char ch1 = s.charAt(i+1);
           if((Character.toUpperCase(ch) ==ch1) || (Character.toLowerCase(ch) == ch1)){

           } else count++;
        } return count;
    }
}