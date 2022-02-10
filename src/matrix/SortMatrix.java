package matrix;

import java.util.*;

public class SortMatrix {
	static void sortedMatrix(int N, int Mat[][]) {
		// code here
		int[] arr = new int[N * N];
		int k = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[k] = Mat[i][j];
				k++;
			}
		}

		Arrays.sort(arr);
		int p = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// arr.add(Mat[i][j]);
				Mat[i][j] = arr[p];
				p++;
			}
		}
		printMatrix(Mat);
		// return Mat;
	}

	public static void printMatrix(int[][] mat) {
		int M = mat.length;
		int N = mat[0].length;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		System.out.println("Printing the original matrix");
		printMatrix(mat);
		System.out.println("Printing the sorted matrix");
		sortedMatrix(mat.length, mat);

	}

}
