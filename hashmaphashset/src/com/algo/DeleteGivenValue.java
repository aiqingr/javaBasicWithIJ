package com.algo;

public class DeleteGivenValue {
    public static class Node{
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node removeValue(Node head, int num) {
        // 看看头部需要删掉多少
        while(head != null) {
            if(head.value != num){
                break;
            }
            head = head.next;
        }
        // head来到第一个不需要删的位置
        Node pre = head;
        Node cur = head;
        while (cur != null) {
            if (cur.value == num) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
        }
        return head;
    }
}
