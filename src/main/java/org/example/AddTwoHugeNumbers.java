package org.example;

public class AddTwoHugeNumbers {
    static ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
        a = reverse(a);
        b = reverse(b);

        ListNode<Integer> c = new ListNode<>(a.value + b.value);
        ListNode<Integer> result = c;
        boolean overflow = false;

        if (c.value >= 10000) {
            c.value -= 10000;
            overflow = true;
        }

        while (a.next != null && b.next != null) {
            c.next = new ListNode<>(a.next.value + b.next.value + (overflow ? 1 : 0));

            if (c.next.value >= 10000) {
                c.next.value -= 10000;
                overflow = true;
            } else {
                overflow = false;
            }
            a = a.next;
            b = b.next;
            c = c.next;
        }

        while (a.next != null) {
            c.next = new ListNode<>(a.next.value + (overflow ? 1 : 0));

            if (c.next.value >= 10000) {
                c.next.value -= 10000;
                overflow = true;
            } else {
                overflow = false;
            }

            a = a.next;
            c = c.next;
        }

        while (b.next != null) {
            c.next = new ListNode<>(b.next.value + (overflow ? 1 : 0));

            if (c.next.value >= 10000) {
                c.next.value -= 10000;
                overflow = true;
            } else {
                overflow = false;
            }

            b = b.next;
            c = c.next;
        }

        if (overflow) {
            c.next = new ListNode<>(1);
        }

        return reverse(result);
    }

    public static ListNode<Integer> reverse(ListNode<Integer> head) {
        ListNode<Integer> prev = null;

        while (head!=null) {
            ListNode<Integer> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    static class ListNode<T> {
        T value;
        ListNode<T> next;
        ListNode(T x) {
            value = x;
        }
    }

    public static void main(String[] args) {
//        ListNode<Integer> a = new ListNode<>(9876);
//        a.next = new ListNode<>(5432);
//        a.next.next = new ListNode<>(1999);
//
//        ListNode<Integer> b = new ListNode<>(1);
//        b.next = new ListNode<>(8001);
//
//        ListNode<Integer> c = solution(a,b);
//
//        while (c != null) {
//            System.out.println(c.value);
//            c = c.next;
//        }

//        ListNode<Integer> d = new ListNode<>(1);
//
//        ListNode<Integer> e = new ListNode<>(9998);
//        e.next = new ListNode<>(9999);
//        e.next.next = new ListNode<>(9999);
//        e.next.next.next = new ListNode<>(9999);
//        e.next.next.next.next = new ListNode<>(9999);
//        e.next.next.next.next.next = new ListNode<>(9999);
//
//        ListNode<Integer> f = solution(d,e);
//
//        while (f != null) {
//            System.out.println(f.value);
//            f = f.next;
//        }

        // 8525, 7103, 755, 947, 7898
        ListNode<Integer> d = new ListNode<>(8525);
        d.next = new ListNode<>(7103);
        d.next.next = new ListNode<>(755);
        d.next.next.next = new ListNode<>(947);
        d.next.next.next.next = new ListNode<>(7898);

        //7251, 7236, 2581, 8901, 8372
        ListNode<Integer> e = new ListNode<>(7251);
        e.next = new ListNode<>(7236);
        e.next.next = new ListNode<>(2581);
        e.next.next.next = new ListNode<>(8901);
        e.next.next.next.next = new ListNode<>(8372);

        ListNode<Integer> f = solution(d,e);

        while (f != null) {
            System.out.println(f.value);
            f = f.next;
        }
    }
}
