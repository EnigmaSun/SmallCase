package test_Niuke;

import java.util.ArrayList;

public class Myarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
	
		a1.add(10);
		a1.add(4);
		a1.add(5);
		a2.add(11);
		a2.add(12);
		a2.add(22);
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.get(5));
		System.out.println(a1.indexOf(4));
		Object[] b = a1.toArray();
		System.out.println(b[1]);
	}
}
