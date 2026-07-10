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
    public ListNode rotateRight(ListNode head, int k) {

        // Edge cases
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find length and last node
        int length = 1;
        ListNode last = head;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        // Step 2: Reduce unnecessary rotations
        k = k % length;

        if (k == 0)
            return head;

        // Step 3: Make the list circular
        last.next = head;

        // Step 4: Find new tail
        int move = length - k - 1;
        ListNode newTail = head;

        while (move > 0) {
            newTail = newTail.next;
            move--;
        }

        // Step 5: New head
        ListNode newHead = newTail.next;

        // Step 6: Break the circle
        newTail.next = null;

        return newHead;
    }
}