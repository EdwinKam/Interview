package com.edwin;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode e = new ListNode(1);
        ListNode d = new ListNode(2,e);
        ListNode c = new ListNode(3, d);
        ListNode b = new ListNode(4, c);
        ListNode a = new ListNode(5, b);
        ListNode dummy = new ListNode(0,a);

        ListNode temp;
        temp =b;
        temp.next=d;
        Solution s = new Solution();
        s.reverseKGroup(a,4);
        while(dummy.next!=null){
            System.out.println(dummy.next.val);
            dummy=dummy.next;
        }

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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newhead=null;
        ListNode tail=null;
        ListNode khead=head;
        ListNode current = head;
        while(current!=null) {
            int count = 0;
            current=khead;
            while (count < k && current != null) {
                current = current.next;
                count++;
            }
            if (count == k) {
                ListNode temp = reverseNode(khead, k);
                if (newhead == null) {
                    newhead = temp;
                }
                if (tail != null) {
                    tail.next = temp;
                }
                tail = khead;
                khead =current;

            }
        }
        if(tail!=null){
            tail.next=khead;
        }
        return newhead;
    }

    public ListNode reverseNode(ListNode head, int k){
        ListNode tail = null;
        ListNode current= head;

        while(k>0){
            ListNode temp = current.next;
            current.next = tail;

            tail=current;
            current = temp;
            k--;
        }
        return tail;
    }
}