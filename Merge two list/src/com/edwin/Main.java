package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        ListNode l1=new ListNode(0, new ListNode(4));
        ListNode l2=new ListNode(3, new ListNode(5));
        System.out.println(s.mergeTwoLists(l1,l2));
    }

}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode root= head;
        while(true){
            if(l1!=null&&l2!=null){
                if(l1.val==Math.min(l1.val,l2.val)){
                    head.next=l1;
                    head=head.next;
                    l1=l1.next;
                }else{
                    head.next=l2;
                    head=head.next;
                    l2=l2.next;
                }

            }else if(l1!=null){
                head.next=l1;
                break;
            }else{
                head.next=l2;
                break;
            }

        }
        return root.next;
    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }