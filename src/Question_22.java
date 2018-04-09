import java.util.ArrayList;
import java.util.List;


public class Question_22 {

	public static List<String> generateParenthesis(int n){
		List<String> list = new ArrayList<>();
		if(n == 0){
			list.add("");
		}else {
			for(int i = 0;i < n;i++){
				for(String left:generateParenthesis(i))
					for(String right:generateParenthesis(n-i-1))
						list.add("(" + left + ")" + right);
			}
		}
		
		return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}

}
