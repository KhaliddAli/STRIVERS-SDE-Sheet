import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ansArray = new ArrayList<>();

        for(int num: nums){
            if(map.containsKey(num) && map.get(num)>nums.length/3) continue;
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/3) ansArray.add(num);
        }

        return ansArray;
    }


}