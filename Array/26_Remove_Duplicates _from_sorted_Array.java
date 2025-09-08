class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
//@ Solution By Shlok 
        int i = 0; // last uni. ele. index
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // place uni. ele.
            }
        }
        return i + 1; // count of ele.
    }
}