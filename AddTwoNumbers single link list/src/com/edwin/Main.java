package com.edwin;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(7,l1);
        ListNode l3 = new ListNode(8,l2);
        l1.tOString(s.addTwoNumbers(l3,l2));

    }
}
    class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstLink = new ListNode();//reference to the first traveled node, will never change during the loop
        ListNode travel = new ListNode();//this node will keep changing while traveling
        firstLink=travel;//set reference
        int carry=0;//declare carry outside the while loop
       while(l1!=null||l2!=null||carry!=0){ //while either one list is not over yet, or if there is carry left
           int sum=0;   //sum changes every loop
           if(l1!=null){
               sum+=l1.val;     //this is add up the sum
               l1=l1.next;  //move to the next node
           }
           if(l2!=null){
               sum+=l2.val;     //add up sum
               l2=l2.next;//move to the next node
           }
           sum+=carry;//carry from last digit
           carry=sum/10;//change carry. if more than 10 then its 10, if not then its 0
           int digit = sum%10;  //only take the last digit
           ListNode newLink = new ListNode();       //create new object
           newLink.val=digit;
           travel.next=newLink;     //we cant do travel.next.val=digit because travel.next is null
           travel=travel.next;      //inc the travel
       }

       return   firstLink.next; //.next becasse there is nothing in the firstlink
    }
}
