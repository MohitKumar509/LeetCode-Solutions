class Solution {
    public int sumofDigits(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+(dig*dig);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            } 
            set.add(n);
            n=sumofDigits(n);
        }
        return true;

        // int slow=n;
        // int fast=n;
        // while(fast!=1){
        //     slow=sumofDigits(slow);
        //     fast=sumofDigits(sumofDigits(fast));

        //     if(fast==1){
        //         return true;
        //     }
        //     if(slow==fast){
        //         return false;
        //     }
        // }
        // return true;
    }
}