class Solution {
    public int lengthOfLongestSubstring(String s) {
      
     //optimal approach

     int left =0;
     int longest=0;
      HashSet<Character> set =new HashSet<>();

     for(int right =0;right<s.length();right++){
      while(set.contains(s.charAt(right))){
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      longest=Math.max(longest,right-left+1);

     }
     return longest;




      /*
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
      return longgest; */
        
    }
}
