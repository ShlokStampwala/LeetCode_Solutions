//today daily challenge done by Shlok stampwala 05/04/2026
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;
        
         for (int i = 0; i < moves.length(); i++) {
           char c = moves.charAt(i);   
        if (c=='U') y++;
        if (c=='D') y--;
        if (c=='R') x++;
        if (c=='L') x--;

        }
        if (x == 0 && y == 0) return true;
        else return false;

    }
}