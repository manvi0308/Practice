package matrix;
import java.util.*;
public class Search2DMatrix {
static boolean searchMatrix(int[][] matrix, int target) {
    boolean isFound = false;
    int rowSize = matrix.length;
    int colSize = matrix[0].length;
    int left = 0;
    int right = (rowSize * colSize) - 1;
    
    while(left <= right) {
    	int mid = (left + (right - left)/2);
    	if(matrix[mid/colSize][mid%colSize] == target) {
    		isFound = true;
    		return isFound;
    	}
    	else if(matrix[mid/colSize][mid%colSize] > target) {
    		right = mid - 1;
    	}
    	else {
    		left = mid + 1;
    	}
    }
    
    return isFound;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		System.out.println(searchMatrix(mat, 6));
	}

}
