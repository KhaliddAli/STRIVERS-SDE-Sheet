class Solution {
    //will use binary search since the matrix is in sorted order
    public boolean searchMatrix(int[][] mat, int t) {
        //checking if the matrix hve only one element
        if(mat.length==1 && mat[0].length==1) return mat[0][0] == t;
        //storing the index of the row which might contain our target
        int row = 0;
        int m = mat.length;
        int n = mat[0].length;
        //initiallising the low and high pointers for binary search
        int lo = 0;
        int hi = m-1;
        //first applying binary search to find the row that might have out target
        while(lo<=hi){
            int mid = (lo+hi)/2;
            //if our row's 1st or last ele is out target we return from here
            if(mat[mid][0]==t || mat[mid][n-1]==t) return true;
            //checking if this row might contain out target
            if(mat[mid][0]<t && mat[mid][n-1]>t){
                row = mid;
                break;
            }
            //if the starting element of the row is greater than out target ele, it means the target lies in the left or upper region of the matrix
            else if(mat[mid][0]>t) hi = mid-1;
            //if the last element of the row is smaller than out target ele, it means the target lies in the right or lower region of the matrix
            else if(mat[mid][n-1]<t) lo = mid+1;
        }
        //initiallising our low and high for binary search in potential row 
        lo = 0;
        hi = n-1;
        //simple binary search
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(mat[row][mid]==t) return true;
            else if(mat[row][mid]>t) hi = mid-1;
            else if(mat[row][mid]<t) lo = mid+1;
        }
        //at this point target was not found
        return false;
    }
}