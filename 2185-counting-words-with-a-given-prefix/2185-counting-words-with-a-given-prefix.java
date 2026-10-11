class Solution {
    public int prefixCount(String[] words, String pref) {
        int p = pref.length();
        int l = words.length;
        int count =0;
        int count1=0;
        for(int i =0; i<l; i++){
            count =0;
            String ch = words[i];
                int m = ch.length();
            if(m>=p){
                
            for(int j =0; j<p; j++){
                
                if(pref.charAt(j)==ch.charAt(j)){
                    count++;
                }
            } if(count==p){
                count1++;
            }
            }
        } return count1;
    }
}