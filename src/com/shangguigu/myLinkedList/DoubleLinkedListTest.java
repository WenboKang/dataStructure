package com.shangguigu.myLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther kangwenbo
 * @create 2020-05-27 19:41
 **/
public class DoubleLinkedListTest {



    //创建节点
    DoubleNode songjiang = null;
    DoubleNode wuyong = null;
    DoubleNode lujunyi =null;
    DoubleNode wusong =null;
    DoubleNode zhishen = null;
    //创建链表
    DoubleLinkedList linkedList = null;

    @Before
    public void init(){
        //创建节点
        songjiang = new DoubleNode(1,"宋江",25);
        wuyong = new DoubleNode(2,"吴用",24);
        lujunyi = new DoubleNode(3,"卢俊义",24);
        wusong = new DoubleNode(4,"武松",22);
        zhishen = new DoubleNode(5,"鲁智深",21);
        //创建链表
        linkedList = new DoubleLinkedList();
    }

    @Test
    public void showListNode() {
        linkedList.addByOrder(songjiang);
        linkedList.addNode(wusong);
        linkedList.showListNode();
    }
    @Test
    public void showListNodeNull() {
        linkedList.showListNode();
    }

    @Test
    public void addNode() {
        linkedList.addNode(lujunyi);
        linkedList.showListNode();
    }

    @Test
    public void addByOrder() {
        linkedList.addByOrder(songjiang);
        linkedList.addByOrder(wuyong);
        linkedList.addByOrder(zhishen);

        linkedList.showListNode();
    }

    @Test
    public void update() {
        linkedList.addByOrder(zhishen);

        DoubleNode newNode = new DoubleNode(5,"鲁智深" , 77);
        linkedList.update(newNode);

        linkedList.showListNode();
    }

    @Test
    public void del() {
        linkedList.addByOrder(songjiang);
        linkedList.addByOrder(wuyong);
        linkedList.addByOrder(zhishen);
        linkedList.showListNode();
        linkedList.del(1);

        linkedList.showListNode();
    }
}