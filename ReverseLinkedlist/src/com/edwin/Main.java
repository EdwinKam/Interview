package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public String toString(){
        return String.valueOf(this.val);

    }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode(0,head);
        ListNode current = root;

    }
}