class Solution {
    public int lengthOfLongestSubstring(String s) {
       int longgest=0;
      //brute force approach
      for(int i=0;i<s.length();i++){

        HashSet<Character> set=new HashSet<>();
        for(int j=i;j<s.length();j++){

          if(set.contains(s.charAt(j))){
            break;
          }
          set.add(s.charAt(j));
          longgest=Math.max(longgest,j-i+1);
        }
      }
      return longgest;
        
    }
}
