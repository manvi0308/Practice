package matrix;

public class SumIthRowJthCol {
	static int sumOfRowCol(int N, int M, int A[][]) {
        // code here
		int sumR = 0;
		int sumC = 0;
		int itr = Math.min(N, M);
		for(int i = 0; i < N; i++) {
			sumR = 0;
			sumC = 0;
			for(int j = 0; j < M; j++) {
				sumR = sumR + A[i][j];
				sumC = sumC + A[j][i];
			}
			if(sumR == sumC) {
				return 1;
			}
		}
		return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 2, 3, 4}, {9, 5, 3, 1}, {0, 3, 5, 6}, {0, 4, 5, 6}};
		System.out.println(sumOfRowCol(4, 4, mat));
	}

}
