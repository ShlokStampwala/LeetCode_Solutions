//Made By @shlokStampwala 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;//array length
        int count=0;//counter
        int max=0; // for find max count with max func.
        for (int i=0 ; i<n ; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max, count);
            }
            else
                count=0 ;// if we got zero flush out count
        }
        return max;//max return...
    }
}