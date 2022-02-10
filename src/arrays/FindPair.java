package arrays;
import java.util.*;
public class FindPair {

	public static boolean findPair(int arr[], int size, int n) {
		// code here.
		Arrays.sort(arr);
		int left = 0;
		int right = left + 1;
		while (left < size && right < size) {
			if (left != right && (Math.abs(arr[left] - arr[right]) == n))
				return true;
			else if (arr[right] - arr[left] > n)
				left = left + 1;
			else
				right = right + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 20, 3,2, 5, 80};
		System.out.println(findPair(arr, arr.length, 2));
		System.out.println(findPair(arr, arr.length, 12));


}
}
