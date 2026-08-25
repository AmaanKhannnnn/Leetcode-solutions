class Solution {
    public int missingMultiple(int[] nums, int k) {
        int l = nums.length;
        int a =0;
        for(int i=1; ; i++){
             a = k*i;
            int count = 0;
           for(int j=0; j<l; j++){
            if(a==nums[j]) count++;
           } if(count==0) break;
        } return a;
    }
}