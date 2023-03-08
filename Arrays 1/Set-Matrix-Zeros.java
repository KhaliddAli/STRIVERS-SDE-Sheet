 // https://leetcode.com/problems/set-matrix-zeroes/description/
class Solution {
    public void setZeroes(int[][] a) {
        //creating 2 separate arrays to store the index of rows and cols having 0
        int row[] = new int[a.length];
        int col[] = new int[a[0].length];
        
        //using loop storing all the indexes of 0

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //after storing indexes , changing the rows and cols
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(row[i]==1 || col[j]==1) a[i][j] =0;
            }
        }
        
    }
}