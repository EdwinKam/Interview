package com.edwin;

import java.util.List;

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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode root=new ListNode(0,head);
        ListNode current = root;
        while(current.next!=null&&current.next.next!=null){
            ListNode second = current.next.next;
            current.next.next=second.next;
            second.next=current.next;
            current.next=second;
            current=second.next;


        }
        return root.next;
    }
}