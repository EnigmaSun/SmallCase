package testing;

import java.util.Scanner;

import org.junit.Test;

//二分查找法，找到第一次出現val值得位置
public class BinarySearch {
	@Test
	public void test(){
		int[] A= new int[]{1,3,4,5,6,7,8,9};
		int n = A.length;
		int val = 5;
		System.out.println(getPos(A, n, val));
	}
	//輸入為數組A，數組長度n，需要尋找位置的值val
	public int getPos(int[] A, int n, int val) {
		if (A == null || n <= 0) {
			return -1;
		}
		int high = n - 1;
		int low = 0;
		//儅查找的小端小於大端的時候進行while循環
		while (low < high) {
			//第一次找二分之一點
			int mid = (high + low) >> 1;
			if (val < A[mid]) {
				//如果尋找的值小於二分之一點的值，則大端變爲mid-1
				high = mid - 1;
			} else if (val > A[mid]) {
				//如果尋找的值大於二分之一點的值，則小端變爲mid+1
				low = mid + 1;
			} else {
				//值等二分之一點的值，將二分之一點的數組標簽賦給大端（因爲要找第一個出現的）
				high=mid;
			}
		}
		if (A[low] == val) {
			/*
			 * 循環完成，此時大端high==mid，
			 * 再來判斷此時的小端是否也等于A[mid]
			 * 如果等於，則小端位置為一次找到的位置
			 */
			return low;
		}
		return -1;
	}

}
