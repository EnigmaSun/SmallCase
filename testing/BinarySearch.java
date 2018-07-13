package testing;

import java.util.Scanner;

import org.junit.Test;

//���ֲ��ҷ����ҵ���һ�γ��Fvalֵ��λ��
public class BinarySearch {
	@Test
	public void test(){
		int[] A= new int[]{1,3,4,5,6,7,8,9};
		int n = A.length;
		int val = 5;
		System.out.println(getPos(A, n, val));
	}
	//ݔ��锵�MA�����M�L��n����Ҫ����λ�õ�ֵval
	public int getPos(int[] A, int n, int val) {
		if (A == null || n <= 0) {
			return -1;
		}
		int high = n - 1;
		int low = 0;
		//�}���ҵ�С��С춴�˵ĕr���M��whileѭ�h
		while (low < high) {
			//��һ���Ҷ���֮һ�c
			int mid = (high + low) >> 1;
			if (val < A[mid]) {
				//������ҵ�ֵС춶���֮һ�c��ֵ���t���׃��mid-1
				high = mid - 1;
			} else if (val > A[mid]) {
				//������ҵ�ֵ��춶���֮һ�c��ֵ���tС��׃��mid+1
				low = mid + 1;
			} else {
				//ֵ�ȶ���֮һ�c��ֵ��������֮һ�c�Ĕ��M�˺��x�o��ˣ���Ҫ�ҵ�һ�����F�ģ�
				high=mid;
			}
		}
		if (A[low] == val) {
			/*
			 * ѭ�h��ɣ��˕r���high==mid��
			 * �ف��Д�˕r��С���Ƿ�Ҳ����A[mid]
			 * �����춣��tС��λ�Þ�һ���ҵ���λ��
			 */
			return low;
		}
		return -1;
	}

}
