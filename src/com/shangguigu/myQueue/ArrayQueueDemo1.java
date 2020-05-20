package com.shangguigu.myQueue;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * @auther kangwenbo
 * @create 2020-05-20 15:01
 **/
public class ArrayQueueDemo1 {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(4);

        Scanner scanner = new Scanner(System.in);//扫描流
        char key = ' ' ;

        boolean loop = true;
        while (loop){
            System.out.println("s(show) : 显示队列");
            System.out.println("e(exit) : 退出程序");
            System.out.println("a(add) :  添加数据到队列");
            System.out.println("g(get) :  从队列去除数据");
            System.out.println("h(head) : 查看队列头部数据");

            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    arrayQueue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 'h': //查看头部的数据
                    try {
                        int res  = arrayQueue.headQueue();
                        System.out.printf("队列头部的数据是%d\n", res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 'e':
                    scanner.close();
                    loop=false; 
                    break;


                default:
                    break;
            }

        }
        System.out.println("程序退出~~");


    }
}
