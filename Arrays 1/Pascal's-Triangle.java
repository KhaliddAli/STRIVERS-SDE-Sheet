//https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //creating ans matrix to store our triangle
        List<List<Integer>> ansMatrix = new ArrayList<>();
        //iterating 0->numRows time;
        for(int i=0;i<=numRows;i++){
            //a variable size Array to store requried values
            ArrayList<Integer> tempList = new ArrayList<>();
            //using for 0->i we are going to store the values present in the current row
            for(int j=0;j<i;j++){
                //setting the 1st and last value in ith row to 1
                if(j==0 || j==i-1) tempList.add(1);
                //for every other index in ith row fetching the value for previous row
                else{
                    int indexVal = ansMatrix.get(i-1).get(j-1) + ansMatrix.get(i-1).get(j);
                    tempList.add(indexVal);
                }
            }
            //after the loop our row array is complete and adding it to our ansMatrix at index i;
            ansMatrix.add(tempList);
        }
        //since the given input value is 1 based ansMatrix have empty ArrayList at index 0 removing it;
        ansMatrix.remove(0);
        return ansMatrix;
    }
}