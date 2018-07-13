package test_Niuke;

import java.util.Arrays;

public class Solution {

	public void SubQuickSort(int[] array,int low,int high) {
		if(low>=high){
			return ;
		}
		int i =low ;int j=high;
		int len=array.length;
		int temp = array[i];
		while(i <j){
			while( i<j && array[j]>=temp ){
				j--;
			}
			array[i]=array[j];
			while(i<j && array[i]<=temp){
				i++;
			}
			array[j]=array[i];
		}
		array[j]=temp;
		SubQuickSort(array,low,i-1);
		SubQuickSort(array,j+1,high);
	}
	public void QuickSort(int[] arr){
		int len=arr.length;
		int low =0;
		int high=len-1;
		SubQuickSort(arr,low,high);
		
	} 

	public static void main(String[] args) {
		int[] arr= new int[]{11,3,44,5,7,888,90,432,56,734};
		System.out.println(Arrays.toString(arr));
		Solution s = new Solution();
		s.QuickSort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
