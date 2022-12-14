package org.example;

public class IsListPalindrome {
    // Singly-linked lists are already defined with this interface:
    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }
        T value;
        ListNode<T> next;
    }

    static boolean solution(ListNode<Integer> l) {
        if (l == null) {
            return true;
        }

        if (l.next == null) {
            return true;
        }

        if (l.next.next == null) {
            return l.value.equals(l.next.value);
        }

        int changeCounter = 0;
        int changeValue = 0;

        int skipCounter = 0;
        int skipValue = 0;

        boolean odd = false;

        ListNode<Integer> fast = l.next.next;
        ListNode<Integer> previous = l;


        while (fast != null) {
            if (l.value > l.next.value) {
                changeCounter--;
                changeValue += l.next.value - l.value;
            }
            if (l.value < l.next.value) {
                changeCounter++;
                changeValue += l.next.value - l.value;
            }
            if (l.value == l.next.value) {
                skipCounter++;
                skipValue += l.value;
            }
            previous = l;
            l = l.next;
            if(fast.next == null) {
                odd = true;
                break;
            }
            fast = fast.next.next;
        }

        if (odd) {
            if (previous.value != l.next.value) {
                return false;
            }

            if (previous.value < l.value) {
                changeCounter--;
                changeValue -= l.value - previous.value;
            }
            if (previous.value > l.value) {
                changeCounter++;
                changeValue -= l.value - previous.value;
            }
            if (l.value == l.next.value) {
                skipCounter--;
                skipValue -= l.value;
            }
            l = l.next;
        }

        while (l.next != null) {
            if (l.value > l.next.value) {
                changeCounter--;
                changeValue += l.next.value - l.value;
            }
            if (l.value < l.next.value) {
                changeCounter++;
                changeValue += l.next.value - l.value;
            }
            if (l.value == l.next.value) {
                skipCounter--;
                skipValue -= l.value;
            }
            l = l.next;
        }

        return changeCounter == 0 && changeValue == 0 && skipCounter == 0 && skipValue == 0;
    }

    public static void main(String[] args) {
        ListNode<Integer> l = new ListNode<>(0);
        l.next = new ListNode<>(1);
        l.next.next = new ListNode<>(0);

        System.out.println(solution(l));

        //[1, 1000000000, -1000000000, -1000000000, 1000000000, 1]

        ListNode<Integer> r = new ListNode<>(1);
        r.next = new ListNode<>(1000000000);
        r.next.next = new ListNode<>(-1000000000);
        r.next.next.next = new ListNode<>(-1000000000);
        r.next.next.next.next = new ListNode<>(1000000000);
        r.next.next.next.next.next = new ListNode<>(1);

        System.out.println(solution(r));
    }
}
