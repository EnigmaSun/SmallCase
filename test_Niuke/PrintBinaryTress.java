package test_Niuke;

import java.util.ArrayList;
import java.util.LinkedList;


//�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��

public class PrintBinaryTress {
	ArrayList<Integer> re = new ArrayList<>();

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null) {
			return re;
		}

		if (root != null) {
			re.add(root.val);
			Printsub(root);

		}

		return re;
	}

	private void Printsub(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				re.add(root.left.val);

			}
			if (root.right != null) {
				re.add(root.right.val);

			}
			Printsub(root.left);
			Printsub(root.right);
		}
	}

}