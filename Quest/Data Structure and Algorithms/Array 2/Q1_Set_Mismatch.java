//take help of chatgpt and shlokstampwala  brain because of some hidden test cases
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums); // hidden case
       int[] ans = new int[2];
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                ans[0] = nums[i]; // duplicate
            }
            if(nums[i+1] - nums[i] > 1){
                ans[1] = nums[i] + 1; // missing
            }
        }
        if(nums[0] != 1) ans[1] = 1; // for special usecase
        if(nums[n-1] != n) ans[1] = n;
        return ans;
    }
}