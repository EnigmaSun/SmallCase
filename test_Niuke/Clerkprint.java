package test_Niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class Clerkprint {

	public Clerkprint() {

	}

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int column = matrix[0].length;
		int row = matrix.length;
		int layers = (Math.min(column, row) - 1) / 2 + 1;
		for (int times = 0; times < layers ; times++) {
			for (int j = times; j < column-times; j++) {
				result.add(matrix[times][j]);
			}
			for (int i = times+1; i < row-times; i++) {
				result.add(matrix[i][column - 1 - times]);
			}
			for (int j = column - 2 - times; j >=times; j--) {
				if(row-times*2>1) result.add(matrix[row - 1 - times][j]);
			}
			for (int i = row - 2 - times; i >  times; i--) {
				if(column-times*2>1) result.add(matrix[i][times]);
			}
			
		}

		return result;

	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrix2 = { { 1, 2, 3, 4 }};
		Clerkprint clerkprint = new Clerkprint();
		ArrayList<Integer> a = clerkprint.printMatrix(matrix1);
		ArrayList<Integer> b = clerkprint.printMatrix(matrix2);
		
		System.out.println(a);
		System.out.println(b);
	}
}
