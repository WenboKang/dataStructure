package com.shangguigu.myQueue;

/**
 * @auther kangwenbo
 * @create 2020-05-20 14:36
 **/
public class CircleArrayQueue {
    private  int maxSize ; //数组的最大容量
    private  int front ;//队列头   指向队列头元素的指针
    private  int rear ; //    指向队列的最后一个元素的后一个位置

    private int []  arr ;  // 用于存放数据，模拟队列

    /**创建队列的构造器
     *
     * @param maxSize 传入队列的大小
     */
    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;//指向队列头的前一个位置
        rear  = 0 ;//队列尾部的数据
    }


    /**
     * 判断队列是否满
     * @return
     */
    public boolean isFull(){
        boolean isFull = ((rear+1)% maxSize) == front;
        return isFull;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return front== rear;
    }

    /**
     * 添加数据
     * @param n
     */
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能加入数据");
            return;
        }
        arr[rear] = n ;
        rear = (rear+1)%maxSize ; //更新指针，向后移
    }

    /**
     * 从队列中拿数据
     * @return
     */
    public int getQueue(){
        if (isEmpty()){
            System.out.println("队列已经为空");
            throw  new RuntimeException("队列空~~");
        }
        //front指向队列的第一个元素
        // 先把front对应的值保留到一个临时变量
        // 将front 指针后移，考虑取模
        // 将临时保存的变量返回
        int value = arr[front];
        front = (front+1)%maxSize;
        return value ;

    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i = front; i<front+size() ; i++) {
            System.out.printf("arr[%d]=%d\n" , i%maxSize ,arr[i%maxSize]);
        }
    }
    /**
     * 当前队列内有效数据的个数
     * @return
     */
    private int size(){
        return (rear+maxSize-front)%maxSize;
    }


    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据···");
        }
        return arr[front];
    }
}
