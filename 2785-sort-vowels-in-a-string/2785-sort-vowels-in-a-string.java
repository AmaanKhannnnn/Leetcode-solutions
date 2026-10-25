import java.util.Arrays;

class Solution {
public String sortVowels(String s) {
char[] arr = s.toCharArray();
char[] vowels = new char[arr.length];
int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
            vowels[count] = arr[i];
            count++;
        }
    }
    Arrays.sort(vowels, 0, count);
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
            arr[i] = vowels[j];
            j++;
        }
    }

    return new String(arr);
}


}
