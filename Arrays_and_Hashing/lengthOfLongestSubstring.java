class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();
        // int l = 0;
        // int maxL = 0;

        // for(int r = 0; r < s.length(); r++) {
        //     char c = s.charAt(r);

        //     while(set.contains(c)) {
        //         set.remove(s.charAt(l));
        //         l++;
        //     }
        //     set.add(c);
        //     maxL = Math.max(maxL, r - l + 1);
        // }
        // return maxL;

        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);
        int l = 0, maxL = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if(lastSeen[c] >= l) {
                l = lastSeen[c] + 1;
            }
            lastSeen[c] = r;
            maxL = Math.max(maxL, r - l + 1);
        }
        return maxL;
    }
}