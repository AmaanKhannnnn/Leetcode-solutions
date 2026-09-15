class Solution {
    public String restoreString(String s, int[] indices) {
        
        char s2[] = new char[indices.length];
        String s3 = "";
        for(int i =0; i<indices.length; i++){
            int k = indices[i];
            s2[k] = s.charAt(i);
        }
        for(int i = 0; i<indices.length; i++){
               s3 = s3+ s2[i];
        } return s3;
    }
}