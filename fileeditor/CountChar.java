package fileeditor;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(sc.nextLine());
		char[] c = sb.toString().toCharArray();
		int[] a = new int[128];
		for (int i = 0; i < c.length; i++) {
			if (('a' <= c[i] && c[i] <= 'z') || (('A' <= c[i] && c[i] <= 'Z'))) {
				char s = c[i];
				a[s]++;
				if (a[s] == 3) {
					System.out.println("The first char added to 3 is :" + s + "\n");
					break;
				}
			}
		}
		sc.close();
	}
}
