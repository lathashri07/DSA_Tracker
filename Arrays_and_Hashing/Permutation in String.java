class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(n1 > n2) return false; 

        HashMap<Character, Integer> count1 = new HashMap<>();
        for(char c1 : s1.toCharArray()) {
            count1.put(c1, count1.getOrDefault(c1, 0) + 1);
        }

        HashMap<Character, Integer> count2 = new HashMap<>();
        for(int i = 0; i < n2; i++) {
            char c2 = s2.charAt(i);
            count2.put(c2, count2.getOrDefault(c2, 0) + 1);

            if(i >= n1) {
                char leftchar = s2.charAt(i - n1);
                count2.put(leftchar, count2.get(leftchar) - 1);
                if(count2.get(leftchar) == 0) {
                    count2.remove(leftchar);
                }
            }
            if(count1.equals(count2)) return true;
        }
        return false;
    }
}