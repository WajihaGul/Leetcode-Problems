import java.awt.*;
import java.math.BigInteger;
import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(8, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(7, new ListNode(8, new ListNode(8)));

        ListNode l3 = addTwoNumbers(l1,l2);

        System.out.println(l3);
        printList(l3);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode(0);
        ListNode node = listNode;

        int sum = 0;
        int carry = 0;

        while(l1 != null || l2 != null){
            sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            node.next = new ListNode(sum);
            node = node.next;

        }

        if(carry >0){
            node.next = new ListNode(carry);
        }
        return listNode.next;
/*
        ListNode res = new ListNode();
        ListNode node = res;

        StringBuilder sb1 = new StringBuilder();
        while(l1 != null){
            sb1.insert(0,l1.val);
            l1 = l1.next;
        }

        StringBuilder sb2 = new StringBuilder();
        while(l2 != null){
            sb2.insert(0,l2.val);
            l2 = l2.next;
        }

        BigInteger b1 = new BigInteger(sb1.toString());
        BigInteger b2 = new BigInteger(sb2.toString());
        BigInteger b3 = b1.add(b2);

        String finalRes = b3.toString();

        for(int i = finalRes.length()-1;i>=0;i--){
            int numToAdd = Character.getNumericValue(finalRes.charAt(i));
            node.next = new ListNode(numToAdd);
            node = node.next;
        }

        return res.next;
*/    }

    public static void printList(ListNode l3){
        while(l3!=null){
            System.out.print(l3.val + "-> ");
            l3 = l3.next;
        }
    }
}
