package fileeditor;

import java.util.Scanner;

public class Filename_extend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =null;
		while (sc.hasNext()) {
			int pos = input.lastIndexOf(".");
			if (input.charAt(pos + 1) == '/' || pos == -1) {
				System.out.println("null");
				return;
			}
			System.out.println(input.substring(pos+1));
		}
	}
}
