//https://leetcode.com/problems/next-permutation/description/

class Solution {
    public void nextPermutation(int[] nums) {
        //taking pointer to find the just previous element of the peek element using a while loop till i is greater than 0 ans out num at i index is greater than the previous element if we get an small element at i index as compared to on previous index our loop will break
        int i= nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        //if we got an peek element the we are going to find the just greater element to in from left of the array
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            //swapping both the elements
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //now reversing all the elements in between i and the last index of array
        reverseArray(nums,i+1);
    }

    void reverseArray(int[] nums, int idx){
        int i=idx , j= nums.length-1;

        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}