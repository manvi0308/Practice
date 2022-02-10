package matrix;
import java.util.*;
public class SumOfUpperAndLowerTriangle {
	 //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
    	ArrayList<Integer> res = new ArrayList<>();
    	// Upper triangle sum
    	// 1  2  3
    	// 4  5  6
    	// 7  8  9
    	// 1 2 3 6 9 5
    	int u = 0;
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < n; j++) {
    			if(i <= j) {
    				u = u + matrix[i][j];
    			}
    		}
    	}
    	int l = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++)
    		if(j <= i) {
    			l = l + matrix[i][j];
    		}
    	}
    	
    	res.add(u);
    	res.add(l);
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= {{6, 5, 4}, {1, 2, 5}, {7, 9, 7}};
		ArrayList<Integer> res = sumTriangles(mat, 3);
		System.out.println(res);
	}

}
