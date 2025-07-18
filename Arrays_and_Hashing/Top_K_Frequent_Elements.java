class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> count = new HashMap<>();
       for(int n:nums) {
        count.put(n, count.getOrDefault(n, 0) + 1);
       }

       List<Integer>[] bucket = new List[nums.length + 1];

       for(int key:count.keySet()) {
        int frequency = count.get(key);
        if(bucket[frequency] == null) {
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(key);
       }

       List<Integer> res = new ArrayList<>();
       for(int top = bucket.length - 1; top >= 0 && res.size() < k; top--) {
        if(bucket[top] != null) {
            res.addAll(bucket[top]);
        }
       }
       return res.stream().mapToInt(i -> i).toArray();
    }
}