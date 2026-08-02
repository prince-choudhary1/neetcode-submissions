class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){

            map.put (nums[i],map.getOrDefault(nums[i],0)+1);

        }
       /* List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();

        }
       return arr;*/

       PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){

        pq.offer(entry);
        if(pq.size()>k){
            pq.poll();
        }
       }

       int arr[]=new int[k];
       for(int i=k-1;i>=0;i--){
        arr[i]=pq.poll().getKey();
       }
       return arr;
        }
       
    
}