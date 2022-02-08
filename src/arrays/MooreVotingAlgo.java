package arrays;

public class MooreVotingAlgo {
	/*
	 * The Boyer-Moore voting algorithm is one of the popular optimal algorithms
	 * which is used to find the majority element among the given elements that have
	 * more than N/ 2 occurrences. This works perfectly fine for finding the
	 * majority element which takes 2 traversals over the given elements, which
	 * works in O(N) time complexity and O(1) space complexity.
	 */
	static int findMajorityElement(int[] arr) {
		int count = 0;
		int majorityC = -1;

		// Find the majority candidate
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				majorityC = arr[i];
				count++;
			} else {
				if (arr[i] == majorityC) {
					count++;
				} else {
					count--;
				}
			}
		}

		// Check if the majority element appears
		// more than N/2 times
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == majorityC) {
				count++;
			}
		}
		if (count > (arr.length / 2)) {
			return majorityC;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 2, 3};
		System.out.println(findMajorityElement(arr));
	}

}
