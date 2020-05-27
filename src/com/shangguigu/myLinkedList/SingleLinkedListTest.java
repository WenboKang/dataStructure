package com.shangguigu.myLinkedList;

import com.shangguigu.myLinkedList.LeetCode.Question1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther kangwenbo
 * @create 2020-05-27 10:38
 **/
public class SingleLinkedListTest {

    //创建节点
    HeroNode songjiang = null;
    HeroNode wuyong = null;
    HeroNode lujunyi =null;
    HeroNode wusong =null;
    HeroNode zhishen = null;
    //创建链表
    SingleLinkedList linkedList = null;

    @Before
    public void init(){
        //创建节点
        songjiang = new HeroNode(1,"宋江","及时雨");
        wuyong = new HeroNode(2,"吴用","智多星");
        lujunyi = new HeroNode(3,"卢俊义","玉麒麟");
        wusong = new HeroNode(4,"武松","行者");
        zhishen = new HeroNode(5,"鲁智深","花和尚");
        //创建链表
         linkedList = new SingleLinkedList();
    }


    /**
     * 无数据情况
     */
    @Test
    public void showListNodeNull() {
        linkedList.showListNode();
    }
    public void showListNode() {
        linkedList.addByOrder(lujunyi);
        linkedList.showListNode();
    }

    @Test
    public void addHero() {
        linkedList.addHero(songjiang);
        linkedList.addHero(zhishen);
        linkedList.showListNode();
    }

    @Test
    public void addByOrder() {
        linkedList.addByOrder(zhishen);
        linkedList.addByOrder(wuyong);
        linkedList.showListNode();
    }


    @Test
    public void update() {
        linkedList.addByOrder(zhishen);
        linkedList.addByOrder(wuyong);
        linkedList.showListNode();
        System.out.println("-----------");
        HeroNode new5 = new HeroNode(5, "鲁智深", "鲁提辖");
        linkedList.update(new5);
        linkedList.showListNode();
    }

    @Test
    public void del() {
        linkedList.addByOrder(songjiang);
        linkedList.addByOrder(wuyong);
        linkedList.addByOrder(lujunyi);
        linkedList.addByOrder(wusong);
        linkedList.addByOrder(zhishen);
        linkedList.showListNode();

        System.out.println("-------------------------");
        linkedList.del(1);
        linkedList.del(5);
        linkedList.showListNode();
    }

    @Test
    public void question1Test() {
        linkedList.addByOrder(songjiang);
        linkedList.addByOrder(wuyong);
        linkedList.addByOrder(lujunyi);
        linkedList.addByOrder(wusong);
        linkedList.addByOrder(zhishen);
        linkedList.showListNode();


        int num = Question1.getLength(linkedList.getHead());
        assertEquals(num,5);

        System.out.println("-------------------");

        linkedList.del(5);//删除第5
        linkedList.showListNode();
        assertEquals(Question1.getLength(linkedList.getHead()),4);

    }
}