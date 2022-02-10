package matrix;

import java.util.Arrays;

public class MedianUsingBS {
	static int median(int[][] matrix, int r, int c)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// Find out the max and min element
		for(int i = 0; i < r; i++) {
			if(matrix[i][0] < min) {
				min = matrix[i][0];
			}
			if(matrix[i][c-1] > max) {
				max = matrix[i][c-1];
			}
		}
		int desired = (r * c + 1)/2;
		
		while(min < max) {
			int mid = min + (max - min)/2;
			int place = 0;
			int get = 0;
			for(int i = 0; i < r; i++) {
				get = Arrays.binarySearch(matrix[i], mid);
				if(get < 0) {
					get = Math.abs(get) - 1;
				}
				else {
					while(get < matrix[i].length && matrix[i][get]==mid)
					{
						get = get + 1;
					}
				}
				place = place + get;
			}
			
			if(place < desired)
				min = mid + 1;
			else
				max = mid;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println(median(mat, mat.length, mat[0].length));
	}

}
