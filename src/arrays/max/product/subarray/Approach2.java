package arrays.max.product.subarray;

public class Approach2 {
	static int maxProduct(int[] arr, int size) {
		// Stores the maximum positive and minimum
		// negative product ending at current index
		int max_ending_here = 1;
		int min_ending_here = 1;
		// Stores the maximum product
		int max_so_far = 0;
		int flag = 0;
		// Traverse through the array
		// max_ending_here will always be 1 or the some positive product ending at
		// arr[i]
		// min_ending_here will always be 1 or some negative product ending at arr[i]
		for (int i = 0; i < size; i++) {
			if (arr[i] > 0) {
				max_ending_here = max_ending_here * arr[i];
				min_ending_here = Math.min(min_ending_here, 1);
				flag = 1;
			} else if (arr[i] == 0) {
				max_ending_here = 1;
				min_ending_here = 1;
			} else {
				int temp = max_ending_here;
				max_ending_here = Math.max(min_ending_here * arr[i], 1);
				min_ending_here = temp * arr[i];

			}
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			
		}
		if (flag == 0 && max_so_far == 0)
			return 0;
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  { 6, -3, -10, 0, 2 };
		System.out.println(maxProduct(arr, arr.length));
	}

}
