class Solution {
    public int repeatedNTimes(int[] nums) {
        //here today i also learn CN Sliding window approach from the one of the solution.. and its not bad to learn from solution.. its my opinion😁
        int i;
       for (i=0 ;i<nums.length -2 ;i++){
        // minus 2 becuase of not overflow of array
        if (nums[i]==nums[i+1] ||nums[i]==nums[i+2] ){
            return nums[i];
        }
       }
      return nums[nums.length - 1]; 
    }
}