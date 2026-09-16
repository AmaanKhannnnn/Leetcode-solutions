class Solution {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        int arr[] = new int[26];
        int l = sentence.length();
        for(int i =0; i<l; i++){
            int k  = sentence.charAt(i) - 'a';
            arr[k]++;
        }
        for(int i = 0; i<26 ; i++){
            if(arr[i] != 0){
                count++;    
            }
        } if(count>=26){
            return true;
        } else return false;
    

    }
}