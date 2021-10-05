package com.algo;

import java.util.Comparator;

public class Code_Comparator {
    public static class Student {
        public int id;
        public String name;
        public int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    // 任何比较器
    // compare方法里，遵循一个统一的规范：
    // 返回负数时，认为第一个参数应该排在前面
    // 返回正数时，认为第二个参数应该排在前面
    // 返回0的时候， 认为无所谓谁放在前面
    public static class IdShengAgeJiangOrder implements Comparator<Student> {

        // 根据id从小到大，但是如果id一样，按照年龄从大到小
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id != o2.id ? (o1.id - o2.id) : (o2.age - o1.age);
        }
    }

    public static class IdAscendingComparator implements Comparator<Student> {

        // 返回负数的时候，第一个参数排在前面
        // 返回正数的时候，第二个参数排在前面
        // 返回0的时候，谁在前面无所谓
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }
}
