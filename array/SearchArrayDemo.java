package array;

import org.junit.Test;

public class SearchArrayDemo {
	@Test
	public void main(){
		int array[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}}; 
		System.out.println(Find(5, array));
		System.out.println(Find2(5, array));
		
	}

	public boolean Find2(int target, int[][] array) {
		for(int i= array.length-1;i>=0;i--){
			for (int j =array[0].length-1;j>=0;j--){
				if (array[i][j]==target){
					return true;
				}
			}
		}
		return false;
	}

	public boolean Find(int target, int[][] array) {
		int rowlength= array.length;
		int i = 0;
		 while((rowlength-1 >= 0)&& (i < array[0].length)){
			if (array[rowlength-1][i] > target) {
				rowlength--;
			} else if (array[rowlength-1][i] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

}
