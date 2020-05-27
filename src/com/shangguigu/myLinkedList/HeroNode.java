package com.shangguigu.myLinkedList;

/**
 * @auther kangwenbo
 * @create 2020-05-20 19:57
 **/

/**
 *  一个梁山好汉  链表
 */
public class HeroNode {
    public int no ;
    public String name ;
    public String nickName;

    public HeroNode nextHero ;  //指向下一个节点

    /**
     * 构造方法
     * @param no 编号
     * @param name 姓名
     * @param nickName 英雄绰号
     */
    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HereNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
