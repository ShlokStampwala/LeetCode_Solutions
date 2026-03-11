class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
//here n is the number of x or y numbers so n+n = 2n length
        for(int i=0 ; i<n ; i++)
        {
            ans[2*i] = nums[i]; // for x (even numbers)
            ans[2*i+1] = nums[i+n]; // for y(odd numbers)
        }
        return ans;
    }
}