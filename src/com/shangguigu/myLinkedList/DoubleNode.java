package com.shangguigu.myLinkedList;

/**
 * @auther kangwenbo
 * @create 2020-05-27 16:06
 **/
public class DoubleNode {
    public int no ;
    public String name ;
    public int age ;

    public DoubleNode pre ;
    public DoubleNode next ;

    public DoubleNode(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
