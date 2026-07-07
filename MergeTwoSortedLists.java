import java.util.List;

class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }

public class MergeTwoSortedLists {
    public static void main(String[] args){
        // list1 = [1,2,4]
        ListNode1 list1 = new ListNode1(1, new ListNode1(2, new ListNode1(4, null)));

        // list2 = [1,3,4]
        ListNode1 list2 = new ListNode1(1, new ListNode1(3, new ListNode1(4, null)));

        ListNode1 merged = mergeTwoLists(list1, list2);

        // print karne ke liye
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 res = new ListNode1();
        ListNode1 head1 = res;

        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                head1.next = list1;
                list1 = list1.next;
            }
            else{
                head1.next = list2;
                list2 = list2.next;
            }
            head1 = head1.next;
        }

        if (list1 != null) {
            head1.next = list1;
        }

        if (list2 != null) {
            head1.next = list2;
        }
        return res.next;
    }
}
