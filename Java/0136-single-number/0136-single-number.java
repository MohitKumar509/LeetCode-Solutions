class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;
        // for(int i=0;i<nums.length;i++){
        //     result=result^nums[i];
        // }
        // return result;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            } else{
                set.add(num);
            } 
        }
        return set.iterator().next();
    }
}