//https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        //we will using finding cycle approach of linkedlist
        //using 2 pointers slow(moves one step) and fast(moves 2 steps ahead)

        int slow = nums[0];
        //initiallising slow at 0 index
        int fast =nums[nums[0]];
        //initiallising fast at the nums[0] value index
        while(slow!=fast){
            //moving slow onces in the array
            slow = nums[slow];
            //moving fast twice
            fast = nums[nums[fast]];
        }

        //initiallising fast to the start
        fast = 0;

        while(slow!=fast){
            //moving both only once
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}