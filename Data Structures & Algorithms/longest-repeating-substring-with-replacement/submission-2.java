class Solution {
    public int characterReplacement(String s, int k) {
        

        // optimal approach
        int left=0;
        int maxlength=0;
        int maxfreq=0;

        int[] freq=new int[26];


        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;

            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            int windowLength = right-left+1;

            int replacement=windowLength-maxfreq;
            if(replacement>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

          maxlength=Math.max(maxlength,right-left+1);
        }


        return maxlength;
            
                /*
        //brute force approach
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'A']++;
                int maxfreq=0;
                for(int count :freq){
                maxfreq=Math.max(maxfreq,count);
                }
                int windowlength=j-i+1;

                int replacement=windowlength-maxfreq;
                if(replacement<=k){

                    maxLength=Math.max(maxLength,windowlength);
                }

            }
        }
        return maxLength; */
        
    }
}
