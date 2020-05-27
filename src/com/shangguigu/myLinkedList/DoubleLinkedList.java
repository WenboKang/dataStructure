package com.shangguigu.myLinkedList;

/**
 * @auther kangwenbo
 * @create 2020-05-27 16:30
 **/
public class DoubleLinkedList {
    private DoubleNode head = new DoubleNode(0 , "" ,0);

    /**
     * 显示链表
     */
    public void showListNode(){
        if (head.next ==null){
            System.out.println("链表为空");
            return;
        }
        // 利用 辅助变量进行遍历
        DoubleNode temp = head.next ; //辅助节点
        while (true) {
            if (temp == null) {//链表到最后了
                break;
            }
            //输出当前节点的信息
            System.out.println(temp.toString());
            //将 节点后移
            temp = temp.next;
        }
    }


    /**
     *
     * @param node
     */
    public void addNode(DoubleNode node){
        DoubleNode temp = head ;  // 因为头节点不能动，因此需要一个辅助遍历 temp
        // 遍历链表，找到最后
        while (true){
            if (temp.next == null){
                break;  // 如果最后为空，就找到末尾
            }
            temp = temp.next ; //没有找到最后，将temp后移一个节点
        }//退出while循环时，temp就指向了链表的最后

        // 将新增加的节点放到最后，最后节点指向新的节点
        temp.next = node ;
        node.pre = temp ;
    }


    public void addByOrder(DoubleNode node){
        DoubleNode temp = head ; //辅助节点  , 位于添加位置的前一个节点 ， 否则无法插入
        boolean isExist = false; // 标志添加的编号是否已经存在
        while (true){ //查找适合插入的位置
            if (temp.next == null){
                break; //到了最后
            }
            if (temp.next.no > node.no){//如果当前节点下一节点的编号 大于 要插入节点的编号
                break; //那就插入到这了位置就可以了
            }else if (temp.next.no == node.no){//相等说明已经存在此编号了
                isExist = true ; // 将标志位置为true
                break;
            }
            temp = temp.next; //节点后移，看后面的节点是否满足条件
        }//找到要插入节点应该存在的位置

        //判断标志位的值
        if (isExist){// 编号已经存在
            System.out.printf("准备插入的英雄编号%d已经存在，不能加入\n",node.no);
        }else{
            // 插入节点  插入到temp的后面
            DoubleNode ex = temp.next; //预先的后面节点

            temp.next = node;
            node.next = ex;

            node.pre = temp;
            if (ex!=null){
                ex.pre = node ;
            }


        }
    }

    /**
     * 修改节点信息， 根据no编号来修改
     * @param node
     */
    public void update(DoubleNode node){
        if (head.next == null){
            System.out.println("链表为空~");
            return;
        }

        // 找到需要修改的节点，根据no编号
        // 定义一个辅助变量 temp,用于遍历
        DoubleNode temp = head.next ;
        boolean isFound = false ; //表示是否找到要修改的节点
        while (true){
            if (temp==null){
                break;//链表最后
            }
            if (temp.no == node.no){//找到要修改的节点
                isFound = true ;
                break;
            }
            temp = temp.next;
        }
        if (isFound){//找到
            temp.name = node.name;
            temp.age = node.age;
        }else{
            System.out.printf("没有找到编号为%d这个英雄信息,不能修改",node.no);
        }
    }


    /**
     * 根据编号删除节点
     * @param no
     */
    public void del(int no){
        DoubleNode temp = head ;
        boolean isFound  = false ; // 是否找到要删除的节点
        while (true){
            if (temp.next == null){ //链表已经到最后
                break;
            }
            if(temp.next.no == no){// 注意是当前节点的下一节点的编号 == no
                //找到了待删除的节点的前一节点
                isFound = true;
                temp = temp.next;
                break;
            }
            temp = temp.next;  //
        }

        if (isFound){ // 要删除的节点为 temp.next
            // 删除节点 ：  建立进的连接
           temp.pre.next = temp.next ;
           if (temp.next !=null){//不是最后一个节点
               temp.next.pre = temp.pre;
           }//最后一个节点不需要执行，否则会空指针异常


        }else{
            System.out.printf("没有找到编号为%d这个英雄信息,无法删除",no);
        }
    }



}
