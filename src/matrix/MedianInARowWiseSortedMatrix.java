package matrix;
import java.util.*;
public class MedianInARowWiseSortedMatrix {
	// Approach 1
	static int median(int matrix[][], int r, int c) {
		// code here
		int[] aux = new int[r*c];
		int k = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				//aux.add(matrix[i][j]);
				aux[k]  = matrix[i][j];
				k++;
			}
		}
		
		Arrays.sort(aux);
		// since the length is always odd, median will be  n-1/2 th element
		return aux[((r*c)-1)/2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,3,5},{2, 6, 9}, {3, 6, 9}};
		System.out.println(median(mat,mat.length, mat[0].length));
	}

}
