/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 // as there is cycle and kunal kushwaha said when there is cycle in linked list use fast and slow pointer approach where fast pointer will move 2 steps where slow pointer will move 1 step at a time , and if the meet there a cycle exists
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
            return true;
        }
        return false;
    }
}
