package com.shangguigu.myQueue;

/**
 * @auther kangwenbo
 * @create 2020-05-20 14:36
 **/
public class ArrayQueue {
    private  int maxSize ; //数组的最大容量
    private  int front ;//队列头
    private  int rear ; //队列尾

    private int []  arr ;  // 用于存放数据，模拟队列

    /**创建队列的构造器
     *
     * @param maxSize 传入队列的大小
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头的前一个位置
        rear = -1 ;//队列尾部的数据
    }


    /**
     * 判断队列是否满
     * @return
     */
    public boolean isFull(){
        boolean isFull = (rear == maxSize-1);
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
        rear++;
        arr[rear] = n ;
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
        front++;
        return arr[front];
    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("arr[%d]=%d\n" , i ,arr[i]);
        }
    }
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据···");
        }
        return arr[front+1];
    }
}
