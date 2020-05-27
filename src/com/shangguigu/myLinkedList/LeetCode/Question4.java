package com.shangguigu.myLinkedList.LeetCode;

/**
 * @auther kangwenbo
 * @create 2020-05-27 14:49
 **/

import com.shangguigu.myLinkedList.HeroNode;
import com.shangguigu.myLinkedList.SingleLinkedList;

import java.util.Stack;

/**
 *  从尾到头 逆序  打印链表
 *  思路 ： 1）可以先反转链表，在打印 ， 但会破坏原本结构  ， 见question2
 *         2） 可以利用栈来做  ， 压入栈再弹出打印
 */


public class Question4 {

    public static void reversePrint(HeroNode head){
        Stack<HeroNode> stack = new Stack<>();
        HeroNode temp = head.nextHero;

        while (temp != null){
            stack.push(temp);
            temp = temp.nextHero ;
        }
        while (!stack.empty()){
            System.out.println(stack.pop().toString());
        }
    }


    public static void main(String[] args) {
        //创建节点
        HeroNode songjiang = null;
        HeroNode wuyong = null;
        HeroNode lujunyi =null;
        HeroNode wusong =null;
        HeroNode zhishen = null;
        //创建链表
        SingleLinkedList linkedList  = new SingleLinkedList();
        songjiang = new HeroNode(1,"宋江","及时雨");
        wuyong = new HeroNode(2,"吴用","智多星");
        lujunyi = new HeroNode(3,"卢俊义","玉麒麟");
        wusong = new HeroNode(4,"武松","行者");
        zhishen = new HeroNode(5,"鲁智深","花和尚");
        linkedList.addByOrder(songjiang);
        linkedList.addByOrder(wuyong);
        linkedList.addByOrder(lujunyi);
        linkedList.addByOrder(wusong);
        linkedList.addByOrder(zhishen);

        HeroNode head = linkedList.getHead();
        System.out.println("原链表");
        linkedList.showListNode();
        System.out.println("逆序打印");
        // 测试
        Question4.reversePrint(head);
    }

}
