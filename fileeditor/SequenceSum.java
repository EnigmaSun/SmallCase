package fileeditor;

import java.util.Scanner;

public class SequenceSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
			double n = sc.nextDouble();
			double m = sc.nextDouble();
			double sum =  0;
			for(double i = 0 ; i< m ; i++){
				sum = sum + n;
				n = Math.pow(n, 0.5);
			}
			Double s = new Double(sum);
			System.out.printf("%.2f", s);
		}
		sc.close();
	}
}
