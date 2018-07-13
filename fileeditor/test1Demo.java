package fileeditor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class test1Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			StringBuffer sb = new StringBuffer();
			for (int i = n; i <= m; i++) {
				int[] arr = new int[3];
				arr[0] = i/100;
				arr[1] = (i%100)/10;
				arr[2] = i%10;
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum += (int) Math.pow(arr[j], 3);	
				}
				if (sum == i) {
//					System.out.println(i);
					sb.append(i);
					if(i !=m){
						sb.append(" ");
					}
				}
			}
			if(sb.length()== 0){
				System.out.println("no");
			}else{
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}
}

/*public class test1Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int m = in.nextInt();
			int n = in.nextInt();
			boolean isfirst = true;
			for(int i=m; i<=n; i++){
				int g = i%10;
				int s = i/10%10;
				int b = i/100;
				if((Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3))==i){
					if(isfirst){
						System.out.print(i);
						isfirst = false;
					}else {
						System.out.println(" "+i);
					}
				}
			}
			if(isfirst){
				System.out.println("no");
			}
		}
	}
}*/