class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0; i<sb.length(); i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=0;
            }
        } String s2 = sb.toString();
        return s2;
    }
}