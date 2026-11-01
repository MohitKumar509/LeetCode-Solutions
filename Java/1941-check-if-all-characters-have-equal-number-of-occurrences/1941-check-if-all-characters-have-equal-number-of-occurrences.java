class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int frequency=map.get(s.charAt(0));

        for(int count:map.values()){
            if(count !=frequency){
                return false;
            }
        }
        return true;
    }
}