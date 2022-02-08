package arrays;

/**
 * @author manvi0308
 */
public class MajorityElement {
	static int findMajority(int[] arr, int n) {
		// O(N^2)
		int max_count = -1;
		int index = -1;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > max_count) {
				max_count = count;
				index = i;
			}
		}
		if (max_count > n / 2) {
			return arr[index];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
		System.out.println(findMajority(arr, arr.length));
	}

}
