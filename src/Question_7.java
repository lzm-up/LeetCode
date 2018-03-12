
public class Question_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int reverse(int x){
		long sum = 0;
		for(;x != 0;x = x/10){
			sum = sum*10 + x%10;
			if(sum > Integer.MAX_VALUE || sum <Integer.MIN_VALUE)
				return 0;
		}
		return (int)sum;
	}
}
