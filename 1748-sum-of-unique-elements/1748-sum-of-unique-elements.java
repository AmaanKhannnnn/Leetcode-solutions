class Solution {
    public int sumOfUnique(int[] nums) {
        int count =1;
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            count =1;
           for(int j = nums.length-1; j>=0; j--){
            if(i != j && nums[i] == nums[j]){
                count++;
            }
           } if(count==1){
            sum=sum+nums[i];
           }
        } return sum;
    }
}