public class ReverseLinkList {
    public static void main(String[] args) {
          // Build list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.print("Original list: ");
        printList(head);

        ListNode reversed = reverseList(head);

        System.out.print("Reversed list: ");
        printList(reversed);
    }
    static void printList(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val).append(" -> ");
            node = node.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
     // Definition for singly-linked list.
      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

        public static ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode prevNode = head;
            ListNode currNode = head.next;
            prevNode.next = null;

            while(currNode != null){
                ListNode nextNode = currNode.next;
                currNode.next = prevNode;

                prevNode = currNode;
                currNode = nextNode;

            }

            return prevNode;
        }
    }
