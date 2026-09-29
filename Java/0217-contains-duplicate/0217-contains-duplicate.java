class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int i=0;
        // while(i<nums.length-1){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        //     i=i+1;
        // }
        // return false;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}