package dami.codinginterview;

import dami.codinginterview.array.Array3;
import dami.codinginterview.array.Array4;
import dami.codinginterview.list.List1;
import dami.codinginterview.list.List2;
import dami.codinginterview.list.List3;
import dami.codinginterview.list.ListNode;

public class Interview {
	public void solutions() {
		new Array3().twoSum(new int[] {2, 3, 4, 7, 8, 9}, 12);
		new Array4().sorting(new int[]{10, 5, 8, 7, 3, 9});
		new List1().reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7))))));
		new List2().findNthNodeFromEnd(2, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7))))));
		new List3().distinct(new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(4)))))));
	}
}