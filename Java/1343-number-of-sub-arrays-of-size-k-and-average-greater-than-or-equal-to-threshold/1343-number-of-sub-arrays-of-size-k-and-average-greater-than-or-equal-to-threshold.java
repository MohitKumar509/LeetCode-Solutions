class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            count++;
        }

        for (int right = k; right < arr.length; right++) {
            sum += arr[right];       
            sum -= arr[right - k];   

            if (sum / k >= threshold) {
                count++;
            }
        }

        return count;
        // int count=0;
        // for(int i=0;i<=arr.length-k;i++){
        //     int sum=0;
        //     for(int j=i;j<i+k;j++){
        //         sum+=arr[j];
        //     }
        //     int average=sum/k;
        //     if(average>=threshold){
        //         count++;
        //     }
        // }
        // return count;

        
    }
}