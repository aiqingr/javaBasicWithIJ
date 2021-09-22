package com.algo;

public class ReverseList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            value = data;
        }
    }

    public static Node reversedLinkedList(Node head){
        Node pre = null;
        Node next = null;
        while (head !=null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static DoubleNode reversedDoubleNode(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode last = null;
        DoubleNode next =null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static Node generateRandomList(int len, int value) {
        int size = (int) (Math.random()*(len+1));
        if(size == 0) {
            return null;
        }
        size--;
        Node head = new Node((int) (Math.random()*(value+1)));
        Node pre = head;
        while(size!=0) {
            Node cur = new Node((int) (Math.random()*(value+1)));
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }
}
