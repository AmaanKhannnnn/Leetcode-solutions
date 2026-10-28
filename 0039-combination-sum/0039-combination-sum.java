class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        findComb(0 , target , 0 , candidates , val , ans);
        return ans;
    }
     void findComb(int i , int target , int sum, int[] candidates , List<Integer> val , List<List<Integer>> ans){
        if(sum == target){
            ans.add(new ArrayList<>(val));
            return;
        }
        if(sum > target || i == candidates.length ){
            return;
        }
        //take
        val.add( candidates[i]);
        sum += candidates[i];
        findComb( i , target , sum , candidates , val, ans );
        //backtracking
        val.remove(val.size() -1);
        sum -= candidates[i];
        // not take
        findComb(i+1, target , sum , candidates , val , ans );
        
    }
    
}