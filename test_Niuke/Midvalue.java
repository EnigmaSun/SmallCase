package test_Niuke;

import java.util.Stack;

public class Midvalue {
	// 非递归方法进行遍历
	TreeNode KthNode1(TreeNode pRoot, int k) {
		if (pRoot == null || k < 0) {
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = pRoot;
		int count = 0;
		while (true) {
			while (p != null || !stack.isEmpty()) {
				stack.push(p);
				p = p.left;
			}
			if (!stack.isEmpty()) {
				p = stack.pop();
				count++;
				if (count == k) {
					return p;
				}
				p = p.right;
			}
		}
	}

	// 递归方法进行遍历
	int count = 0;

	TreeNode KthNode2(TreeNode pRoot, int k) {
		if (pRoot == null || k < 0) {
			return null;
		}
		TreeNode p = pRoot;

		if (p != null) {
			TreeNode node = KthNode2(p.left, k);
			if (node != null)
				return node;
			count++;
			if (count == k)
				return p;
			node = KthNode2(p.right, k);
			if (node != null)
				return node;
		}
		return null;
	}

}
