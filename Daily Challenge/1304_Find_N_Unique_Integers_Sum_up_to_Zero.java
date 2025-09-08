class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        
        // add pairs
        for (int i = 1; i <= n / 2; i++) { //i represents values for +ve and same -ve.
            res[index++] = i;
            res[index++] = -i;
        }
        
        // if n is odd, put 0 in the end
        if (n % 2 == 1) {
            res[index] = 0;//in this the indez will be last if its odd then...
        }
        
        return res;
    }
}
