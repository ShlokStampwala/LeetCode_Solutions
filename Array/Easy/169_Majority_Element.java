class Solution {
    // The element which occurs more than n/2 times is considered as a majority Element
    // An array can contain only 1 majority Element
    public static int majorityElement(int[] nums) {
        // Using Boyer-Moore Voting Algorithm
        int element = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == element){                 // If current element is our chosen element then increase the count
                count++;
            } else {                                // If current element is not the chosen element
                if(count == 0){
                    element = nums[i];              // If count is 0 then current Element has equal chances to become our majority Element
                    count++;
                }       
                else count--;
            }
        }

        return element;
    }
}