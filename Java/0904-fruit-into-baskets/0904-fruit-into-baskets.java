class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<fruits.length){
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);

            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i=i+1;
            }
            max=Math.max(max,j-i+1);
            j=j+1;
        }
        return max;
        // int max=0;
        // for(int i=0;i<fruits.length;i++){
        //     Set<Integer> set=new HashSet<>();
        //     for(int j=i;j<fruits.length;j++){
        //         set.add(fruits[j]);

        //         if(set.size()>2){
        //             break;
        //         }
        //         max=Math.max(max,j-i+1);
        //     }
        // }
        // return max;
        
    }
}