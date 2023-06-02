/*Given the head of a linked list and an integer val,
remove all the nodes of the linked list that has Node.val == val, and return the new head. */

public class RemoveLinkedListElements {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val){
        while (head != null && head.val == val){
            head = head.next;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
