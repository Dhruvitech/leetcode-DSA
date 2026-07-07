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
        ListNode d1 = new ListNode(0);
        d1.next=headA;

        ListNode d2= new ListNode(0);
        d2.next=headB;

        while(d1!=d2){
            if(d1==null){
                d1=headB;
            }
            else if(d2==null){
                d2=headA;
            }
            else{
            d1=d1.next;
            d2=d2.next;
            }
        }
        if(d1==d2){
            return d1;
        }
        return null;


        
    }
}