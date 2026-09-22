class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLen=0;

        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;

        // int maxLen=0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //         maxLen=Math.max(maxLen, j-i+1);
        //     }
        // }
        // return maxLen;
    }
}