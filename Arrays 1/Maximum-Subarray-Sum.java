//https://leetcode.com/problems/maximum-subarray/description/
class Solution {
    public int maxSubArray(int[] nums) {
        //using kadane's algo to solve

        //using maxSum variable to store the final result
        int maxSum =Integer.MIN_VALUE;
        //using currentSubArraySum to store the sum or the current subarray in the loop
        int currentSubArraySum = 0;
       
        //looping on the array and taking prefix sum of the previous subarray and adding ith element in it
        for( int i: nums){
            //using prefix sum there are 2 options either start a new sum of new subarray or carry forward the sum of previous subarray

            int option1 = currentSubArraySum + i;
            int option2 = i;
            //changing current subarray sum to the max value to decide between 2 options
            currentSubArraySum = Math.max(option1,option2);
            //comparing the maxSum with this new CurrentSubArraySum
            maxSum = Math.max(maxSum,currentSubArraySum);
        }
        return maxSum;

    }
}
