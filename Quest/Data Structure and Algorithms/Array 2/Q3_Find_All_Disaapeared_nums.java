//Done by Shlok Stampwala 01/04/2026
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {  
     boolean[] seen = new boolean[nums.length+1]; // for tick marking who is present in the array
    for(int num : nums) {//full loop mechanisms through nums like python
        seen[num]=true;
         }
    List<Integer> ans = new ArrayList<>();
    for(int i = 1; i <= nums.length; i++){
    if(!seen[i]) ans.add(i) ; // adding those nums which have false in the seen...
        }
    return ans;
        
    }
}