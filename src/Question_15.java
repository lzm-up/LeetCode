
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Question_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0};
		System.out.println(threeSum(nums));
	}
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0;i<nums.length;i++){
			if(i!=0 && nums[i] == nums[i-1]) continue;
			int j = i+1,l = nums.length -1;
			int target = -nums[i];
			while(j < l){
				if(nums[j] + nums[l] == target){
					list.add(Arrays.asList(nums[i],nums[j],nums[l]));
					j++;
					l--;
					while(j<l && nums[j] == nums[j-1]) j++;
					while(j<l && nums[l] == nums[l+1]) l--;
				}else if(nums[j] + nums[l] < target){
					j++;
				}else {
					l--;
				}
			}
		}
		return list;
	}
}
