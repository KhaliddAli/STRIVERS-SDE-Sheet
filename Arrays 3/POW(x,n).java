
class Solution {
    //recursive program
    //n is taken as long as integer.MIN_VALUE can overflow when changed to +ve
    double getPow(double x , long n){
        //base case
        if(n==0) return 1;
        //calling ans for smaller power
        double sAns = getPow(x,n/2);
        //if n is divided by 2 the answer will be X^N/2 * X*N/2;
        //eg 2^4 = 2^2 * 2^2
        if(n%2==0) return sAns*sAns;
        //if n is not divisible by 2
        //2^5 = 2^2 * 2^2 * 2
        return sAns*sAns*x;
    }
    public double myPow(double x, int n) {
        //if n ==0 return 1.0000
        if(n==0) return 1D;
        //since n can be negetive we send the absolute value of n
        double ans = getPow(x,Math.abs(n));
        //if n is negetive dividing the whole ans by 1
        if(n<0) return 1D/ans;
        //if n is +ve returning as it is
        return ans;
    }
}