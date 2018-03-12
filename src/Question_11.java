
public class Question_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*	public static int maxArea(int[] height){
		int maxarea = 0;
		for(int i = 0;i < height.length;i++){
			for(int j = i + 1;j<height.length;j++){
				maxarea = Math.max(maxarea, (j-i)*(height[j]<height[i]?height[j]:height[i]));
			}
		}
		return maxarea;
	}*/
	public static int maxArea(int[] height){
		int maxarea = 0, l = 0,r = height.length - 1;
		while(l < r){
			maxarea = Math.max(maxarea,Math.min(height[l],height[r])*(r - l));
			if(height[l] < height[r])
				l++;
			else
				r++;
		}
		return maxarea;
	}
}
