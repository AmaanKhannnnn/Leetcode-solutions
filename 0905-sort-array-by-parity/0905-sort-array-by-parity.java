class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int l = nums.length;
       int i =0;
       while( i<l && nums[i]%2==0)
       i++;
       int j=i+1;
       
       while(i<l){
        while(j<l){ 
            if(nums[j]%2==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
            else j++;
        }  break;
       } return nums;
    }
}