class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
          List<Integer> curr = new ArrayList<>();
          int i=0;
          subset(ans,curr,i,nums);
          return ans;


        
    }
    public static  void subset(List<List<Integer>> ans,List<Integer> curr,int idx,int[]  nums){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[idx]);
        subset(ans,curr,idx+1,nums);
        curr.remove(curr.size()-1);
        subset(ans,curr,idx+1,nums);
    
    }
}