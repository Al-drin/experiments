package org.example;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(l1.val+ l2.val);
        ListNode currentResult = result;

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            currentResult.next = new ListNode(l1.val+ l2.val);
            currentResult = currentResult.next;
        }

        while (l1.next != null) {
            l1 = l1.next;
            currentResult.next = new ListNode(l1.val);
            currentResult = currentResult.next;
        }

        while (l2.next != null) {
            l2 = l2.next;
            currentResult.next = new ListNode(l2.val);
            currentResult = currentResult.next;
        }

        currentResult = result;

        while (currentResult.next != null) {
            if (currentResult.val > 9) {
                currentResult.val -= 10;
                currentResult.next.val += 1;
            }
            currentResult = currentResult.next;
        }

        if (currentResult.val > 9) {
            currentResult.val -= 10;
            currentResult.next = new ListNode(1);
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode returnList1 = addTwoNumbers(l1, l2);

        System.out.println("N1:\n" + l1.val);
        while (l1.next != null) {
            l1 = l1.next;
            System.out.println(l1.val);
        }

        System.out.println("N2:\n" + l2.val);
        while (l2.next != null) {
            l2 = l2.next;
            System.out.println(l2.val);
        }

        System.out.println("Result:\n" + returnList1.val);
        while (returnList1.next != null) {
            returnList1 = returnList1.next;
            System.out.println(returnList1.val);
        }

        ListNode l3 = new ListNode(9);

        ListNode l4 = new ListNode(1);
        l4.next = new ListNode(9);
        l4.next.next = new ListNode(9);
        l4.next.next.next = new ListNode(9);
        l4.next.next.next.next = new ListNode(9);
        l4.next.next.next.next.next = new ListNode(9);
        l4.next.next.next.next.next.next = new ListNode(9);
        l4.next.next.next.next.next.next.next = new ListNode(9);
        l4.next.next.next.next.next.next.next.next = new ListNode(9);
        l4.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode returnList2 = addTwoNumbers(l3, l4);

        System.out.println("N1:\n" + l3.val);
        while (l3.next != null) {
            l3 = l3.next;
            System.out.println(l3.val);
        }

        System.out.println("N2:\n" + l4.val);
        while (l4.next != null) {
            l4 = l4.next;
            System.out.println(l4.val);
        }

        System.out.println("Result:\n" + returnList2.val);
        while (returnList2.next != null) {
            returnList2 = returnList2.next;
            System.out.println(returnList2.val);
        }
    }
}
