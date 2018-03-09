import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Question_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			map.put(s.charAt(i), i+1);
		}
		System.out.println(map.get('b'));
	}
	public static int lengthOfLongestSubstring(String s){
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0,i = 0,j = 0;
		while(i<n&&j<n){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}
			else{
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}

}
