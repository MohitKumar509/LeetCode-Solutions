class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int num:nums){
            sum+=num;
            int required=sum-k;
            if(map.containsKey(required)){
                count+=map.get(required);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);  
            }
        return count;
    }

    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++){
    //             sum+=nums[j];
    //             if(sum==k){
    //                 count++;
    //             }
    //         }
            
    //     }
    //     return count;
    // }
}