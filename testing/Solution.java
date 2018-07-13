package testing;
import java.util.Scanner;
public class Solution {
	/**
	 * 获得两个整形二进制表达位数不同的数量
	 * 
	 * @param m
	 *            整数m
	 * @param n
	 *            整数n
	 * @return 整型
	 */
	public int countBitDiff(int m, int n) {
		int val = m ^ n;
		int count =0;
		while(val!=0){
			count++;
			val=val&(val-1);
		}
		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.print(solution.countBitDiff(m, n));
		}
		sc.close();
    }
}
