import java.util.Arrays;


public class Question_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int threeSumClosest(int[] nums,int target){
		long minDiff = Long.MAX_VALUE;
		long diff;
		long sum;
		long result=0;
		if(nums.length<=3){
			sum = 0;
			for(int i = 0;i<nums.length;i++)
				sum += nums[i];
			return (int)sum;
		}
		Arrays.sort(nums);
		for(int i = 0;i<nums.length;i++){
			int j = i + 1,k = nums.length - 1;
			while(j < k){
				sum = nums[i] + nums[j] + nums[k];
				diff = Math.abs(sum-target);
				if(diff == 0)
					return (int)sum;
				if(diff < minDiff){
					minDiff = diff;
					result = sum;
				}
				if(sum > target){
					k--;
				}else{
					j++;
				}
			}
		}
		return (int)result;
	}
}
