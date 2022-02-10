package matrix;

public class RowWithMax1s {
	static int rowWithMax1s(int arr[][], int n, int m) {
		// code here
		int col = m - 1, row = -1;

		for (int i = 0; i < n; i++) {
			for (int j = col; j >= 0; j--) {
				if (arr[i][j] == 1) {
					row = i;
					col--;
				} else {
					break;
				}
			}
		}
		return row;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 1, 1, 0, 0}, {0, 0, 0, 1, 1}};
		System.out.println(rowWithMax1s(mat, mat.length, mat[0].length));
	}

}
