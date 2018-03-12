
public class Question_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isMatch(String s,String p){
		if(p.isEmpty()) return s.isEmpty();
		boolean first_match = false;
		if(!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'))
			first_match = true;
		if(s.length()>2 && p.charAt(1) == '*')
			return (isMatch(s,p.substring(2)) || (first_match && isMatch(s.substring(1),p)));
		else 
			return first_match && isMatch(s.substring(1),p.substring(1));
	}
}
