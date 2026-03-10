//  Q1 of  DSA Quest array1 Done by Shlok Stampwala
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        //as per given after n length repeatation
        int[]ans = new int [2*n];

        for (int i=0 ; i<n ; i++){
            ans[i] = nums[i];
            ans[n+i] = nums [i];
        }
        return ans;
    }
}