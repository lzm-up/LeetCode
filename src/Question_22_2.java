import java.util.ArrayList;
import java.util.List;


public class Question_22_2 {

	public static List<String> generateParenthesis(int n){
		List<String> list = new ArrayList<String>();
		generate(n,n,"",list);
		return list;
	}
	private static void generate(int left, int right, String str, List<String> list) {
		// TODO Auto-generated method stub
		if(left == 0 && right == 0){
			list.add(str);
			return;
		}
		if(left > 0){
			generate(left -1,right,str + "(",list);
		}
		if(right > left){
			generate(left,right-1,str + ")",list);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3).toString());
	}

}
