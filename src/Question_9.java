
public class Question_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Boolean isPalindrome(int x){
		if(x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int rev = 0;
		while( x > rev){
			rev = rev*10 + x%10;
			x = x/10;
		}
		return x == rev || x == rev/10;
	}
}
