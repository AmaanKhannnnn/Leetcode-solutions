class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" "); 
        int m = arr.length;
        String str[] = new String[m];
        for(int i=0; i<m; i++){
            int k = arr[i].length();
        int l = arr[i].charAt(k - 1) - '0';
        str[l - 1] = arr[i].substring(0, k - 1);
        }
        String o = String.join(" ",str);
        return o;
    }
}