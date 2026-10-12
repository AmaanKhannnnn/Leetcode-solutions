class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
         int count =0;
         
         int l = words.length;
         for(int i =0; i<l;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            for(int j=l-1; j>i; j--){
                StringBuilder s2 = new StringBuilder(words[j]);
                 s2.reverse();
                if(words[i].equals(s2.toString())){
                    count++;
                }
            }
         } return count;

    }
}