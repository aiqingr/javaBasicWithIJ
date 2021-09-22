package com.algo;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
//    哈希表的简单介绍总结
//    哈希表在使用层面上可以理解为一种集合结构
//    如果只有key，没有伴随数据value，可以使用HashSet结构（C++中叫UnOrderedSet）
//    如果既有key，又有伴随数据value，可以使用HashMap结构（C++中叫UnOrderedMap）
//    有无伴随数据，是HashMap和HashSet唯一的区别，底层的实际结构是一样的
//    使用哈希表的增（put），删（remove）， 改（put）和查（get）的操作， 可以认为时间复杂度为O(1)， 但是常数时间比较大
//    放入哈希表的东西，如果是基础类型，内部按值传递，内存占用就是这个东西的大小
//    放入哈希表的东西，如果不是基础类型，内部按引用传递，内存占用是这个东西的内存地址大小, 一律只占八字节

//    有序表的简单介绍总结
//    有序表在使用层面上可以理解成一种结合结构
//    如果只有key，没有伴随数据value，可以使用TreeSet结构（C++中叫OrderedSet）
//    如果既有key，又有伴随数据value，可以使用TreeMap结构（C++中叫OrderedMap）
//    有无伴随数据，是TreeSet和TreeMap唯一的区别，底层的实际结构是一样的
//    有序表和哈希表的区别是，有序表把key按照顺序组织起来，而哈希表完全不组织
//    红黑树，AVL书，size-balance-tree和跳表等都属于有序表结构，只是底层具体实现不同
//    放入有序表的东西，如果是基础类型，内部按值传递，内存占用就是这个东西的大小
//    放入有序表的东西，如果不是基础类型，必须提供比较器，内部按照引用传递， 内存占用是这个东西内存地址的大小
//    不管是什么底层具体实现，只要是有序表，都有以下固定的基本功能和固定的时间复杂度
//    时间复杂度都是O(logN)
    public static class Node {
        public int value;

        public Node(int val) {
            value = val;
        }
    }

    public static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.value - o2.value;
        }
    }


    public static void main(String[] args) {
//      使用哈希表的增（put），删（remove）， 改（put）和查（get）的操作， 可以认为时间复杂度为O(1)， 但是常数时间比较大
//      hashSet1的key是基础类型 -> int类型
        Node nodeA = null;
        Node nodeB = null;
        Node nodeC = null;
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        System.out.println(hashSet1.contains(1));
        hashSet1.remove(1);
        System.out.println(hashSet1.contains(1));

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "ni");
        System.out.println(hashMap1.containsKey(1));
        System.out.println(hashMap1.containsValue("ni"));
        hashMap1.put(1, "tong");
        System.out.println(hashMap1.containsKey(1));
        System.out.println(hashMap1.containsValue("ni"));
        System.out.println(hashMap1.containsValue("tong"));
        hashMap1.put(2, "yang");
        System.out.println(hashMap1.containsKey(2));
        hashMap1.put(3, "ye");
        System.out.println(hashMap1.get(3));
        System.out.println(hashMap1.containsValue("ye"));
        hashMap1.remove(1);
        System.out.println(hashMap1.get(1));
        System.out.println(hashMap1.containsKey(1));
        System.out.println(hashMap1.get(4));
        System.out.println(hashMap1.size());

        System.out.println("============1==========");

//      hashSet2的key是非基础类型 ->Node类型
        nodeA = new Node(1);
        nodeB = new Node(1);

        HashSet<Node> hashSet2= new HashSet<>();
        hashSet2.add(nodeA);
        hashSet2.add(nodeB);
        System.out.println(hashSet2.contains(nodeA));
        System.out.println(hashSet2.contains(nodeB));
        hashSet2.remove(nodeA);
        System.out.println(hashSet2.contains(nodeA));
        System.out.println(hashSet2.contains(nodeB));
        System.out.println(hashSet2.size());

        System.out.println("============2==========");

//      有序表常用操作
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(1, "I am 1");
        treeMap1.put(2, "I am 2");
        treeMap1.put(4, "I am 4");
        treeMap1.put(5, "I am 5");
        treeMap1.put(6, "I am 6");
        treeMap1.put(6, "My name changed to 6'");
        System.out.println(treeMap1.containsKey(1));
        System.out.println(treeMap1.get(6));
        System.out.println(treeMap1.firstKey() + "，我最小");
        System.out.println(treeMap1.lastKey()+ "，我最大");
        System.out.println(treeMap1.floorKey(3) + "，在表中所有<=3的数中，我离3最近");
        System.out.println(treeMap1.ceilingKey(3) + "，在表中所有>=3的数中，我离3最近");
        System.out.println(treeMap1.floorKey(4) + "，在表中所有<=4的数中，我离3最近");
        System.out.println(treeMap1.ceilingKey(4) + "，在表中所有>=4的数中，我离3最近");
        treeMap1.remove(2);
        System.out.println(treeMap1.get(2) + "，删了就没有了");

//      treeSet的Key是非基础类型 -> Node类型
        nodeA = new Node(5);
        nodeB = new Node(3);
        nodeC = new Node(7);

        TreeSet<Node> treeSet = new TreeSet<>();
        try{
            treeSet.add(nodeA);
            treeSet.add(nodeB);
            treeSet.add(nodeC);
        } catch (Exception e) {
            System.out.println("错误信息：" + e.getMessage());
        }

        treeSet = new TreeSet<>(new NodeComparator());
        try{
            treeSet.add(nodeA);
            treeSet.add(nodeB);
            treeSet.add(nodeC);
        } catch (Exception e) {
            System.out.println("错误信息：" + e.getMessage());
        }


    }
}
