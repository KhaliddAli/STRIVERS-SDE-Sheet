//https://leetcode.com/problems/sort-colors/description/

class Solution {
    void merge(int[] arr, int start, int mid, int end){
        //to reduce complication storing the left sorted part and the right sorted part of the array into 2 arraylists
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int i=start;i<=mid;i++){
            leftArr.add(arr[i]);
        }
        for(int i=mid+1;i<=end;i++){
            rightArr.add(arr[i]);
        }
        //using to 2 pointer approach to merge two sorted arrays into a new sorted array
        int i=0;
        int j=0;
        ArrayList<Integer> resArr = new ArrayList<>();
        while(i<leftArr.size() && j<rightArr.size()){
            int a =leftArr.get(i);
            int b = rightArr.get(j);
            //if the value of left sorted array is smaller adding it to result
            if(a<=b){
                resArr.add(a);
                i++;
            }
            else{
                resArr.add(b);
                j++;
            }
        }
        //since there is probability of onr array still having elemets so adding the remaining elements of that array to res
        while(i<leftArr.size()){
            resArr.add(leftArr.get(i));
            i++;
        }
        while(j<rightArr.size()){
            resArr.add(rightArr.get(j));
            j++;
        }
        //updating the sorted res array into our main array
        int indx = start;
        for(int k=0;k<resArr.size();k++){
            arr[indx+k] = resArr.get(k);
        }
    }
    //recursive function to divide the array in 2 parts
    void MergeSort(int[] arr, int start , int end){
        //base case if start == element means our array have only 1 element, and an array having single element is always sorted.
        if(start==end) return;
        int mid = (start+end)/2;
        //calling our recursive mergesort fn for 2 different parts of the array
        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);
        //merging the 2 sorted arrays part
        merge(arr,start,mid,end);
    }
    public void sortColors(int[] nums) {
        //for better time complexity using merge sort
        MergeSort(nums,0,nums.length-1);
    }
}