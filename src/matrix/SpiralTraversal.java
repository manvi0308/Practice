/*
 * *
 * Given a matrix of size r*c. Traverse the matrix in 
 * spiral form. 
 * Expected Time Complexity: O(r*c) 
 * Expected Auxiliary Space: O(r*c), 
 * for returning the answer only.
*/
package matrix;
import java.util.*;
public class SpiralTraversal {
	//Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	// Make the 4 pointers
    	int left = 0;
    	int right = matrix[0].length - 1;
    	int top = 0;
    	int bottom = matrix.length - 1;
    /*	res.add(top);
    	res.add(bottom);
    	res.add(left);
    	res.add(right);*/
    	int dir = 0;
    	while(left <= right && top <= bottom)
    	{
    		if(dir == 0) {
    			for(int i = left; i <= right; i++) {
    				res.add(matrix[top][i]);
    			}
    			top++;
    		}
    		else if(dir == 1) {
    			for(int i = top; i <= bottom; i++) {
    				res.add(matrix[i][right]);
    			}
    			right--;
    		}
    		else if(dir == 2) {
    			for(int i = right; i >= left; i--) {
    				res.add(matrix[bottom][i]);
    			}
    			bottom--;
    		}
    		else if(dir == 3) {
    			for(int i = bottom; i >= top; i--) {
    				res.add(matrix[i][left]);
    			}
    			left++;
    		}
    		dir = (dir+1)%4;
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		ArrayList<Integer> res = spirallyTraverse(mat, mat.length, mat[0].length);
		System.out.println(res);
	}

}
