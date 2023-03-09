//https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
        //we will be storing our result in ArrayList because we dont know the fixed size of the resultant array
        ArrayList<int[]> ans = new ArrayList<>();
        //sorting the array on the basis of the value of start
        Arrays.sort(intervals, (a,b) -> {
            return a[0] - b[0];
        });
        int cStart = intervals[0][0], cEnd = intervals[0][1];

        for(int[] i : intervals){
            //if the value of current end is greater than tha start of the next value means it lies in the merged range
            if(cEnd>= i[0]){
                //changing the current end value to the max value of end
                 cEnd = Math.max(cEnd,i[1]);
            }
            else{
                //if the current interval doesn't lies in the merge part we add the previous start and end to aour ans
                ans.add(new int[]{cStart,cEnd});
                //and change the start and end
                cStart = i[0];
                cEnd = i[1];
            }
        }
        //since one interval will be left we add the remaning ans 
        ans.add(new int[]{cStart,cEnd});

        return ans.toArray(new int[ans.size()][]);
    }
}