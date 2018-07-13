package test_Niuke;

import java.util.ArrayList;

public class Windows {

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> ret = new ArrayList<>();
		if (num == null) {
			return ret;
		}
		if (num.length < size || size < 1) {
			return ret;
		}

		for (int i = 0; i < num.length - size+1; i++) {
			int max = num[i];
			for (int j = i; j < i + size; j++) {
				if(num[j]>max){
					max = num[j];
				}
			}
			ret.add(max);
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
		Windows wd=new Windows();
		ArrayList ret= wd.maxInWindows(a,3);
		System.out.println(ret);
	}

}
