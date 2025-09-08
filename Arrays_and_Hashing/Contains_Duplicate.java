class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> keys = new HashSet<>();

        for(int num : nums) {
            if(keys.contains(num)) {
                return true;
            }
            keys.add(num);
        }
        return false;
    }
}