package com.shangguigu.myLinkedList.LeetCode;

import com.shangguigu.myLinkedList.HeroNode;
import com.shangguigu.myLinkedList.SingleLinkedList;

/**
 * @auther kangwenbo
 * @create 2020-05-27 13:18
 **/


/**
 * 单链表的反转
 */
public class Question3 {

      public static HeroNode reverseList (HeroNode head){
            if (head.nextHero==null || head.nextHero.nextHero == null){
                  return null; //空链表或只有一个节点 无需反转
            }
            HeroNode pre = null; // 前节点
            HeroNode cur = head.nextHero ; //当前节点
            HeroNode next = null ; //下一节点

            while (cur!=null){

                  next = cur.nextHero ; //保存原下一节点
                  cur.nextHero = pre; // 新下一节点
                  pre = cur;  // 往后遍历 ， 新的前节点
                  cur = next ; // 往后遍历 , 新的 当前节点
            }
            return pre;
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
            linkedList.showListNode();

            HeroNode node = Question3.reverseList(head);

            while(node!=null){
                  System.out.println(node.toString());
                  node = node.nextHero;
            }

      }
}
