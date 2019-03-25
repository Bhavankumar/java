/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author bhosaman
 *
 */
class ListNode {

    ListNode() {
    }
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Add2Numbers {

    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int i = 0;
        int carry = 0;

        while (l1.next != null || l2.next != null) {
            if (l1.val + l2.val == 10) {
                carry = 1;
                result.val = l1.val + l2.val + 1;
            } else {
                result.val = l1.val + l2.val;

            }

        }
        // return result;
        if (result.val != 0) {
            System.out.println(result.val);
        }

    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        a.val = 2;
        a.next.val = 3;
        a.next.next.val = 4;
        a.next = null;
        ListNode b = new ListNode();
        b.val = 5;
        b.next.val = 4;
        b.next.next.val = 3;
        b.next = null;

        ListNode result = new ListNode();
        addTwoNumbers(a, b);
//        if (result.val != 0) {
//            System.out.println(result.val);
//        }

    }

}
