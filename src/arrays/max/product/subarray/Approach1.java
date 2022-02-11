package arrays.max.product.subarray;

public class Approach1 {
	/*
	 * Traverse every sub array and find the maximum product
	 */
	static int maxSubArrayProduct(int[] arr) {
		int res = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int mul = arr[i];
			for (int j = i + 1; j < n; j++) {
				res = Math.max(mul, res);
				mul = mul * arr[j];
			}
			res = Math.max(res, mul);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, -3, -10, 0, 2 };
		System.out.println(maxSubArrayProduct(arr));
	}

}
