import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Question_18 {

	public static List<List<Integer>> fourSum(int[] nums, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for(int i = 0;i<nums.length-3;i++){
			threeSum(nums,i,nums[i]-target,list,set);
		}
		return list;
	}

	public static List<List<Integer>> threeSum(int[] nums,int k,int _target,List<List<Integer>> list,HashSet<List<Integer>> set){
		for(int i = k + 1;i<nums.length - 2;i++){
		    //if(i!=0 && nums[i] == nums[i-1]) continue;
			int j = i+1,l = nums.length -1;
			int target = -nums[i] - _target;
			while(j < l){
				if(nums[j] + nums[l] == target){
					if(!set.contains(Arrays.asList(nums[k],nums[i],nums[j],nums[l]))){
						set.add(Arrays.asList(nums[k],nums[i],nums[j],nums[l]));
						list.add(Arrays.asList(nums[k],nums[i],nums[j],nums[l]));
					}
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,0,0,0};
		System.out.println(fourSum(nums,0));
	}
}
