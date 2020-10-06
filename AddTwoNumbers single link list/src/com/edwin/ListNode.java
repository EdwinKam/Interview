package com.edwin;

public class ListNode {
	public int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public void tOString(ListNode hi){
		while(hi!=null){
			System.out.print(hi.val);
			System.out.printf(" ");
			hi=hi.next;
		}
	}
}
