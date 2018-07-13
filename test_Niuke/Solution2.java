package test_Niuke;

import java.util.ArrayList;

public class Solution2 {
	public void reOrderArray(int[] array) {
		int length = array.length;
		ArrayList<Integer> ood = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> re = new ArrayList<>();


		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 0) {
				even.add(array[i]);
			} else if (array[i] % 2 != 0) {
				ood.add(array[i]);
			}
		}
		re.addAll(ood);
		re.addAll(even);
		
		
		for (int i = 0; i < length; i++) {
			array[i] = re.get(i);
		}

	}
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] array = new int[]{2,3,44,12};
	
		solution2.reOrderArray(array);
		System.out.println(array);
	}
}
