package fileeditor;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = (a + b);
			System.out.println(sum);
			}catch(Exception e ){
				System.out.println("error");
				
			}finally{

			}
		}
	}
}
