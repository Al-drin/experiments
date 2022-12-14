package org.example;

public class RemoveKFromList {
    static ListNode<Integer> solution(ListNode<Integer> l, int k) {

        if (l == null) {
            return null;
        }

        if (l.next == null && l.value == k) {
            return null;
        }

        while (l.value == k) {
            if (l.next == null) {
                return null;
            } else {
                l = l.next;
            }
        }

        ListNode<Integer> a = l.next;

        while (a.next != null) {
            if (a.next.value == k) {
                a.next = a.next.next;
            } else {
                a = a.next;
            }
        }

        return l;

    }

    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }
        T value;
        ListNode<T> next;
    }

    public static void main(String[] args) {
        ListNode<Integer> l = new ListNode<>(123);

        l.next = new ListNode<>(456);
        l.next.next = new ListNode<>(789);
        l.next.next.next = new ListNode<>(0);

        int k = 0;

        ListNode<Integer> r = solution(l,k);

        while(r != null) {
            System.out.println(r.value);
            r = r.next;
        }
    }

}
