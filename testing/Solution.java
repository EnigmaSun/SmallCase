package testing;
import java.util.Scanner;
public class Solution {
	/**
	 * ����������ζ����Ʊ��λ����ͬ������
	 * 
	 * @param m
	 *            ����m
	 * @param n
	 *            ����n
	 * @return ����
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
