class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int l = word1.length;
        int m = word2.length;
       String s1 = "";
       String s2 = "";
       for(int i = 0; i<l; i++){
        s1 = s1 + word1[i];
       }
        for(int j = 0; j<m; j++){
            s2 = s2 + word2[j];
        }
        if(s1.equals(s2)){
            return true;
        } else return false;
    }
}