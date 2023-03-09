//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] m) {
        int n = m.length;
        //transposing the matrix
        //transpose means interchanging the rows with cols
        for(int i=0;i<n;i++){
            //running j loop for i times only else the matrix will end up in its original state
            for(int j=i;j<n;j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        //reversing the matrix 
        for(int i=0;i<n;i++){
            Reverse(m[i]);
        }
    }
    //2 pointers method for reversal 
    void Reverse(int[] a){
        int i=-1;
        int j=a.length;
        while(++i<--j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}