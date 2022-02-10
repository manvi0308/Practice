package arrays;

import java.util.*;

public class MinimizeTheHeightDifference {
	/*
	 * Given an array arr[] denoting heights of N towers and a positive integer K,
	 * you have to modify the height of each tower either by increasing or
	 * decreasing them by K only once. Find out what could be the possible minimum
	 * difference of the height of shortest and longest towers after you have
	 * modified each tower.
	 */
	static int getMinDiff(int[] arr, int n, int k) {
		// code here
		Arrays.sort(arr);
		int ans = (arr[n - 1] + k) - (arr[0] + k); // Maximum possible height difference

		int tempmax = arr[n - 1] - k; // Maximum element when we
		// subtract k from whole array
		int tempmin = arr[0] + k; // Minimum element when we
									// add k to whole array
		int max, min;

		for (int i = 0; i < n - 1; i++) {
			if (tempmax > (arr[i] + k)) {
				max = tempmax;
			} else {
				max = arr[i] + k;
			}

			if (tempmin < (arr[i + 1] - k)) {
				min = tempmin;
			} else {
				min = arr[i + 1] - k;
			}

			if (ans > (max - min)) {
				ans = max - min;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 9, 12, 16, 20 };
		System.out.println(getMinDiff(arr, 5, 3));
	}

}
