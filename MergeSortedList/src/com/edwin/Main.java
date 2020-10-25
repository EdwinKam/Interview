package com.edwin;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.metal.MetalButtonUI;
import java.io.Flushable;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s =new Solution();
        ListNode l1=new ListNode(4, new ListNode(4));
        ListNode l2=new ListNode(3, new ListNode(5));
        ListNode[] lists = {};
        System.out.println(s.mergeKLists(lists));
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode head = new ListNode();
        ListNode root = head;
        while(end(lists)){
            head.next=min(lists);
            head=head.next;

        }
        return root.next;
    }
    private boolean end(ListNode[] lists){
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                return true;
            }
        }
        return false;
    }
    private ListNode min(ListNode[] lists) {
        ListNode result = new ListNode();
        int index = 0;
        int min = 2147483647;
        for (int i = 0; i < lists.length; i++) {
            if(lists[i]!=null) {
                if (lists[i].val < min) {
                    index = i;
                    min = lists[i].val;
                    result = lists[i];
                }
            }
        }
        lists[index] = lists[index].next;
        return result;
    }
}