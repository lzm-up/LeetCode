import java.util.HashMap;
import java.util.Map;


public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static int romanToInt(String s){
		//final int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		//final String[] flags = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		Map<Character,Integer> map = new HashMap<>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		int sum = 0;
		//if(map.get(s.charAt(0))<map.get(s.charAt(s.length()-1)))
		//	map.put(s.charAt(s.length()-1),-map.get(s.charAt(s.length()-1)));
		for(int i = 0;i < s.length()-1;i++){
			if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
				sum -= map.get(s.charAt(i));
			}
			else{
				sum += map.get(s.charAt(i));
			}
		}
		sum += map.get(s.charAt(s.length()-1));
		return sum;
	}
}
