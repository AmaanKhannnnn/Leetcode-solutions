class Solution {
    public int smallestIndex(int[] nums) {
        
        int l = nums.length;
        for(int i =0; i<l; i++){
            int sum=0;
            while(nums[i]>0){
                int k = nums[i]%10;
              sum=sum+k;
              nums[i]=nums[i]/10;
            } if(sum==i){
                return i;
            }
        }  return -1;
    }
}