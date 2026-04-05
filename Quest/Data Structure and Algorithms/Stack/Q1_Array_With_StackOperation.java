//done in quest by Shlok stampwala 05/04/2026
class Solution {
    public List<String> buildArray(int[] target, int n) {
      List<String> ans = new ArrayList<>();
      int i= 0; //pointer
      for(int num = 1 ; num<=n ; num ++){
        if(num == target[i]){
            ans.add("Push");
            i++;
            if(i == target.length) break ; //if target achive work done
        }
        else{
            ans.add("Push");
            ans.add("Pop");
        }

      }  
      return ans;
    }
}