public class Solution {
       public String Encode(List<String> str) {
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s.length()).append('#').append(s);
		}
		return sb.toString();
	}
	
	public List<String> Decode(String str) {
		List<String> res = new ArrayList<>();
		
		int i = 0;
		while(i < str.length()) {
			int j = i;
			while(str.charAt(j) != '#') {
				j++;
			}
			int length = Integer.parseInt(str.substring(i, j));
			String word = str.substring(j+1, j+1+length);
			res.add(word);
			i = j+1+length;
		}
		return res;
	}
}