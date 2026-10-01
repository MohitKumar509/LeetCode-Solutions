class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            int average=sum/k;
            if(average>=threshold){
                count++;
            }
        }
        return count;

        // int sum=0;
        // int count=0;
        // int left=0;
        // for(int right=0;right<k.length;i++){
        //     sumx+=arr[right];
        //     sum=sumx/k;
        //     if(sum>=threshold){

        //     } else {
        //         left++;
        //         right++;
        //     }
        // }
    }
}