class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        int ans=0; //for base value like in sqrt of 8 is 2.8284.. we will store 2 

        while(low<=high){
            int mid =low+(high-low)/2;

            long sqrt=(long)mid*mid;

            if(sqrt==x){
                return mid;
            }
            else if(sqrt<x){
                ans=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return ans; //that base case when we get point values for 8 we will get ans=2
    }
}