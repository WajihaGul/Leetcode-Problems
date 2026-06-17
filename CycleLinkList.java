public class CycleLinkList {
    public static void main(String[] args) {
        // Build the list 3 -> 2 -> 0 -> -4 manually
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Test 1: no cycle
        System.out.println("Has cycle (no cycle case): " + hasCycle(head));

        // Test 2: create a cycle by pointing the last node back to the second node
        head.next.next.next.next = head.next; // -4 -> 2, forming a loop
        System.out.println("Has cycle (cycle case): " + hasCycle(head));
    }
    //  Definition for singly-linked list.
      static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }


      public static boolean hasCycle(ListNode head) {
            ListNode slowPtr = head;
            ListNode fastPtr = head;

            while(slowPtr != null && fastPtr != null && fastPtr.next != null){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;

                if(slowPtr == fastPtr){
                    return true;
                }
            }
            return false;
        }
    }

