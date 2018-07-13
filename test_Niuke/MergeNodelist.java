package test_Niuke;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class MergeNodelist {
	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode mergeNode= null;
		while(list1 !=null && list2 !=null){
			if(list1.val<list2.val){
				mergeNode.next=list1;
				mergeNode=mergeNode.next;
				list1=list1.next;
			}else{
				mergeNode.next=list2;
				mergeNode=mergeNode.next;
				list2=list2.next;
			}
		}
		if(list1 !=null){
			mergeNode.next=list1;
		}
		if(list2 !=null){
			mergeNode.next=list2;
		}
		return mergeNode.next;
	}
}
