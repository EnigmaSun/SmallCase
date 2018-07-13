package testing;

public class FirstRepeat {
	public char findFirstRepeat(String A, int n) {
		//將字符串轉換爲字符數組
		char[] cbs = A.toCharArray();
		//用來存儲每個字符的出現的次數
		int[] chars = new int[256];
		if (A == null || n <= 0) {
			return 0;
		}
		int i = 0;
		for (i = 0; i < n - 1; i++) {
			//chars[cbs[i]] == 0表示之前沒有出現過
			if (chars[cbs[i]] == 0) {
				//加一標記出現一次了
				chars[cbs[i]] = 1;
			} else {
				//遇到出現過的字符了，跳出for回圈
				break;
			}
		}
		return cbs[i];
	}
}
