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
  }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode copy=head;
        ListNode second=head;
        ListNode dummy= new ListNode();
        dummy.next=second;
        while(head!=null){
            count++;
            copy=copy.next;
        }
        for(int i =0; i<count-n;i++){
            second=second.next;
        }
        second =second.next.next;
        return dummy.next;


    }
}