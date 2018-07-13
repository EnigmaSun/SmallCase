package array;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}

	public void add(int value) {
		this.next = new ListNode(value);
		
	}
}

public class Solution {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list_out = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		System.out.println(stack);
		while(!stack.isEmpty()){
            list_out.add(stack.pop());
        }
		return list_out;

	}

	public static void main(String[] args) {
		ListNode listin = new ListNode(1);
		listin.add(12);
		listin.add(33);
		listin.add(1);
		listin.add(18);
		Solution solution = new Solution();
		ArrayList<Integer> list_out = solution.printListFromTailToHead(listin);
		System.out.println(list_out);

	}
}
