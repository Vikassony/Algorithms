//Largest Sum Contiguous Subarray
// O(N)
class Solution {
	public int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int max_so_far = Integer.MIN_VALUE;
		int max_end_here = 0;
		for (int i = 0; i < nums.length; i++) {
			max_end_here = max_end_here + nums[i];
			if (max_so_far < max_end_here)
				max_so_far = max_end_here;
			if (max_end_here < 0)
				max_end_here = 0;
		}
		return max_so_far;
	}
}
