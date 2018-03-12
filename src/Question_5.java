
public class Question_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababagfdcaba";
		System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s){
		int len = s.length();
		int ans = 0;
		String longest = "";
		for(int i = 0;i<len;i++){
			for(int j = i;j<len;j++){
				if(isPalindrome(s.substring(i,j+1))){
					if((j+1-i)>ans){
						ans = j+1-i;
						longest = s.substring(i,j+1);
					}
				}
			}
		}
		return longest;
	}
	public static Boolean isPalindrome(String s){
		int len = s.length();
		for(int i = 0,j = len-1;i<j;i++,j--){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		return true;
	}
}
