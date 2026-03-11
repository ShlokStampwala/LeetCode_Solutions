//Done by ShlokStampwala with help of chatgpt
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1; //for n=0 to 1 
        int mask = 0; // for all 1's
        while(mask<n) {
            mask = (mask << 1) | 1;
            //do left shift  by 1
        }
        return mask ^ n;

    }
}