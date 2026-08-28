class Solution {
    public String reversePrefix(String word, char ch) {

        String s = "";

        int l = word.length();
        int i = 0;

        while(i < l && word.charAt(i) != ch) {
            i++;
        }

        if(i == l) {
            return word;
        }

        for(int j = i; j >= 0; j--) {
            s = s + word.charAt(j);
        }

        for(int j = i + 1; j < l; j++) {
            s = s + word.charAt(j);
        }

        return s;
    }
}