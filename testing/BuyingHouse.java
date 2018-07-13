package testing;

import java.util.Scanner;

public class BuyingHouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n > 50 || n < 10) {
				System.out.println("the salary must be in the range[10,50].");
				System.exit(1);
			}
			int m = in.nextInt();
			if (m > 20 || m < 1) {
				System.out.println("the increasing rate must be in the range[1,20].");
				System.exit(1);
			}

			double savingMoney = 0;
			double housePrice = 200;
			int i = 1;
			boolean a = true;
			while (savingMoney < housePrice) {
				savingMoney = savingMoney + n;
				housePrice = 200 * Math.pow((1.00 + m / 100.00), i);
				System.out.println("saving:" + savingMoney);
				System.out.println("house:" + housePrice);
				i++;
				if (i > 21) {
					a = false;
					break;
				}
			}
			if (a == true) {
				System.out.println(i);
			} else {
				System.out.println("impossible");
			}

		}
		in.close();
	}
}
