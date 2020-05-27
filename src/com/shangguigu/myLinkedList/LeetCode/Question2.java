package com.shangguigu.myLinkedList.LeetCode;

/**
 * @auther kangwenbo
 * @create 2020-05-27 11:37
 **/


import com.shangguigu.myLinkedList.HeroNode;
import com.shangguigu.myLinkedList.SingleLinkedList;

/**
 * 查找单链表中倒数第K个节点
 * 思路： 快慢指针
 */
public class Question2 {
    public static HeroNode getLastIndexNode(HeroNode head , int k){
        HeroNode res = null ;
        HeroNode slow =  head.nextHero;
        HeroNode fast =  head.nextHero ;

        for (int i = 0; i <k ; i++) {
            fast = fast.nextHero;
        }// 快指针先遍历k个节点
        while (fast.nextHero!=null){
            slow = slow.nextHero;
            fast = fast.nextHero;
        }
        res = slow.nextHero;
        return res;
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

        HeroNode node = Question2.getLastIndexNode(head, 3);
        System.out.println(node.toString());


    }
}
