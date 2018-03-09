import java.util.Arrays;



public class Question_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3};
		int[] nums2 = {2,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	public static double findMedianSortedArrays(int[] nums1,int[] nums2){
		int n = nums1.length;
		int m = nums2.length;
		int i = 0;
		int[] num = new int[m+n];
		for(i = 0;i<n+m;i++){
			if(i<n){
				num[i] = nums1[i];
			}
			else{
				num[i] = nums2[i-n];
			}
		}
		Arrays.sort(num);
		if((m+n)%2==0){
			return (double)(num[(m+n)/2]+num[(m+n)/2-1])/2;
		}
		else{
			return (double)num[(m+n-1)/2];
		}
	}
}
