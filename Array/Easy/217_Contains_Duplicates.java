class Solution {
    public boolean containsDuplicate(int[] nums) {
        //here we do first sort and the check num[i]==num[i+1] if it is simply we return true we do using this only 1 for loop and 
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0 ; i<n-1 ; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    
    }
}