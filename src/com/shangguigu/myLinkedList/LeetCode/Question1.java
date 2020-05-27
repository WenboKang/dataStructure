package com.shangguigu.myLinkedList.LeetCode;

/**
 * @auther kangwenbo
 * @create 2020-05-27 11:22
 **/


import com.shangguigu.myLinkedList.HeroNode;

/**
 * 获取到单链表中有效节点的个数
 */
public class Question1 {

    /**
     *
     * @param hereNode 头节点
     * @return 有效节点的个数
     */
    public static  int getLength(HeroNode hereNode){
        if (hereNode==null ||hereNode.nextHero==null){
            return 0;
        }
        int count =0;

        HeroNode temp = hereNode.nextHero ; //辅助节点
        while (temp!=null){
            count++;
            temp = temp.nextHero ; // 遍历
        }
        return count;
    }



}
