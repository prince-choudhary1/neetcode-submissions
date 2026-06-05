class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length()){
        return false;
       }

       char[] arr= s.toLowerCase().toCharArray();
       char[] arr2= t.toLowerCase().toCharArray();
       Arrays.sort(arr);
       Arrays.sort(arr2);

      return Arrays.equals(arr,arr2);

    }
}
