class Solution {
    public int minSteps(String s, String t) {
        int arr[] = new int[26];
        int count =0;
        for(int i =0; i< s.length(); i++){
            int k = s.charAt(i) - 'a';
            arr[k]++;
        }
        for(int i =0; i<t.length(); i++){
            int k = t.charAt(i) -'a';
            arr[k]--;
        }
        for(int i =0; i<26; i++){
            if(arr[i]>0) count = count + arr[i];
        } return count;
        
    }
}