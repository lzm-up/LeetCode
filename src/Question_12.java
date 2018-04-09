
public class Question_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(1996));
	}
	public static String intToRoman(int num){
		if(num <= 0 ) return "";
		String ret = "";
		final int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		final String[] flags = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i = 0;i < 13 && num > 0;i++){
			if(num < number[i]) continue;
			while(num >= number[i]){
				num -= number[i];
				ret += flags[i];
			}
		}
		return ret;
	}
}
