class Solution {
    public int maxArea(int[] heights) {

    //optimal approach 

    int left=0;
    int right=heights.length-1;
    int maxArea=0;

    while(left<right){

      int height=Math.min(heights[left],heights[right]);
      int width= right-left;
      int area=width*height;
      maxArea=Math.max(maxArea,area);

      if(heights[left]<heights[right]){
        left++;
      }
      else{
        right--;
      }
      
    }

     return maxArea;






      /*int maxArea=0;
      for(int i=0;i<heights.length;i++){

        for(int j=i+1;j<heights.length;j++){

          int height=Math.min(heights[i],heights[j]);
          int width=j-i;
          int area=width*height;
          maxArea=Math.max(maxArea,area);

        }
      }
        return maxArea;*/
    }
}
