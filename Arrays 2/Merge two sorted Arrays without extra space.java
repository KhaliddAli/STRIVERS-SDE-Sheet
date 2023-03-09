//https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //we will use 3 pointers
        int p1 = m-1;
        //p1 will point at the greatest element in nums1
        int p2 = n-1;
        //p2 will point at the greatest element in nums2
        int indx = m+n-1;
        //indx will keep the index at which our greater element will be added
        while(p1>=0 && p2>=0){
            //if ele at p1 >= ele at p2 it will be added at the back in result
            if(nums1[p1]>=nums2[p2]){
                nums1[indx] = nums1[p1];
                p1--;
                indx--;
            }
            else{
                nums1[indx] = nums2[p2];
                p2--;
                indx--;
            }
        }
        //adding any left elements

        while(p2>=0){
            nums1[indx] = nums2[p2];
            p2--; indx--;
        }
    }
}