package testing;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble()) {
			double num = in.nextDouble();
			double a = num - (int) num;
			if (a >= 0.5) {
				System.out.println((int) num + 1);
			} else {
				System.out.println((int)(num - a));
			}
		}
	}
}
