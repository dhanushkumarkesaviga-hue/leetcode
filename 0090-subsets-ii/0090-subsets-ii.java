class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,0);
        return list;
    }
    void backtrack(List <List<Integer>>list,List tl,int nums[],int ind){
        list.add(new ArrayList<>(tl));
        for(int i = ind;i<nums.length;i++){
            if(i>ind &&nums[i]==nums[i-1])continue;

            tl.add(nums[i]);
            backtrack(list,tl,nums,i+1);
            tl.remove(tl.size()-1);
        }
    }
}