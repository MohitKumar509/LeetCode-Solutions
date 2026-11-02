class Solution {
    public int majorityElement(int[] nums) {
        int frequency=0;
        int candidate=0;
        for(int num:nums){
            if(frequency==0){
                candidate = num;
            }
            if(num==candidate){
                frequency++;
            } else {
                frequency--;
            }
        }
        return candidate;
    }
}