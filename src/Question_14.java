


public class Question_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String longestCommonPrefix(String[] strs){
		if(strs.length == 0) return "";
		int res = strs[0].length();
		for(int i = 0;i<strs.length-1;i++){
			//if(strs[i] == "") return "";
            if(i+1 < strs.length)
                res = Math.min(res, numPrefix(strs[i],strs[i+1]));
		}
		return strs[0].substring(0,res);
		
	}
	private static int numPrefix(String s1, String s2) {
		// TODO Auto-generated method stub
		int j = 0;
		for(;j<Math.min(s1.length(), s2.length());j++){
			if(s1.charAt(j) != s2.charAt(j))
				return j;
		}
		return j;
	}
}
