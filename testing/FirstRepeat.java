package testing;

public class FirstRepeat {
	public char findFirstRepeat(String A, int n) {
		//���ַ����D�Q���ַ����M
		char[] cbs = A.toCharArray();
		//�Á�惦ÿ���ַ��ĳ��F�ĴΔ�
		int[] chars = new int[256];
		if (A == null || n <= 0) {
			return 0;
		}
		int i = 0;
		for (i = 0; i < n - 1; i++) {
			//chars[cbs[i]] == 0��ʾ֮ǰ�]�г��F�^
			if (chars[cbs[i]] == 0) {
				//��һ��ӛ���Fһ����
				chars[cbs[i]] = 1;
			} else {
				//�������F�^���ַ��ˣ�����for��Ȧ
				break;
			}
		}
		return cbs[i];
	}
}
