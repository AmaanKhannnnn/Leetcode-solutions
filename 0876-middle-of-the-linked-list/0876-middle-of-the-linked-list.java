/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
           int count =0;
           ListNode temp = head;
           ListNode temp2 = head;
           while(temp != null){
               count++;
               temp=temp.next;
           }
           int k = count/2;
           while(k>0){
              temp2= temp2.next;
              k--;
           }
           return temp2;
           

    }
}