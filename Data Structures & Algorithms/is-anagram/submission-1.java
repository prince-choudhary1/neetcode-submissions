class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length()){
        return false;
       }

       /*char[] arr= s.toLowerCase().toCharArray();
       char[] arr2= t.toLowerCase().toCharArray();
       Arrays.sort(arr);
       Arrays.sort(arr2);

      return Arrays.equals(arr,arr2);*/

       int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
      return true;
    }
}
