/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode temp3 = headA;
        ListNode temp4 = headB;
        int l1 = 0;
        int l2 = 0;
        while(temp1 != null){
            l1++;
            temp1 =temp1.next;
        }
        while(temp2 != null){
            l2++;
            temp2 =temp2.next;
        }
        int d = Math.abs(l1-l2);
        if(l1>l2){
            while(d>0){
                temp3 = temp3.next;
                d--;
            }
        } else {
            while(d>0){
                temp4 = temp4.next;
                d--;
            }
        }
        while(temp3 != null && temp4 != null){
            if(temp3==temp4){
                return temp3;
            }
            temp3=temp3.next;
            temp4=temp4.next;
        }
        return null;

    }
}