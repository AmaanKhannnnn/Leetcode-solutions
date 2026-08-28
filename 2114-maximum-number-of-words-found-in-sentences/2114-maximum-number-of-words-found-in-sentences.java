class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int l = sentences.length;
        for(int i =0; i<l; i++){
            String arr[] = sentences[i].split(" ");
            int k = arr.length;
            if(k>max)
            max=k;
        } return max;
    }
}