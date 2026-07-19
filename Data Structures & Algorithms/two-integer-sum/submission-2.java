class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(!map.containsKey(a)){
                map.put(nums[i],i);

            }else{
           return new int[] {map.get(a),i};
            }
        }
          return new int[]{};
            }
}
