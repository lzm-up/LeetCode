import java.util.ArrayList;
import java.util.List;


public class Question_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println(letterCombinations("5"));
	}
	public static List<String> letterCombinations(String digits){
		List<String> list = new ArrayList<>();
		String[] table = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		letterCombination(list,digits,"",0,table);
		return list;
	}
	private static void letterCombination(List<String> list, String digits,
			String curr, int index, String[] table) {
		// TODO Auto-generated method stub
		if(index == digits.length()){
			if(curr.length()!=0)
				list.add(curr);
			return;
		}
		String temp = table[digits.charAt(index) - '0'];
		for(int i = 0;i<temp.length();i++){
			String next = curr + temp.charAt(i);
			letterCombination(list,digits,next,index+1,table);
		}
	}

}
