import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)>n/2) return i;
        }
        return -1;
    }

     //moose algo
     public int majorityElement_Optimal(int[] nums){
        int cnt =0;
        int ele = 0;

        for(int num : nums){
            if(cnt == 0) ele = num;
            if(ele == num) cnt++;
            else cnt--;
        }

        return ele;
    }
}