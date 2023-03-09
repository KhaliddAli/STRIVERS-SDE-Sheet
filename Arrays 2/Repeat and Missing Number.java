//https://bit.ly/3Gs6wZu

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int freq[] = new int[arr.size()+1];
        
        for(int i: arr){
            freq[i]++;
        }
        int ans[] = new int[2];
        for(int i=1;i<=n;i++){
            if(freq[i]>1) ans[1] = i;
            if(freq[i] == 0) ans[0] =i;
        }
        return ans;
    }
}