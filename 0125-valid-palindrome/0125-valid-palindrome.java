class Solution {
    public boolean isPalindrome(String s) {
        String b = s.toLowerCase();
        StringBuilder sb = new StringBuilder(b);
        int count =0;
        for(int i =0; i< sb.length(); i++){
            char c = sb.charAt(i);
            if(Character.isLetterOrDigit(c)){

            } else {
                sb.delete(i,i+1);
                i--;
            }
        }   int i =0;
            int j = sb.length()-1;
            while(j>i){
                if(sb.charAt(i) == sb.charAt(j)){
                       count =0;
                       i++;
                       j--;
                } else return false;
            } 
            if(count==0){
                return true;
            } else return true; 

    }
}