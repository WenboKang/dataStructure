package com.shangguigu.sparsearray;

/**
 * @auther kangwenbo
 * @create 2020-05-20 11:21
 **/
public class SparseArray {
    public static void main(String[] args) {
        //创建一个 11*11 的二维数组
        // 0 无棋子   1 黑棋子  2 白棋子
        int chessArr[][] = new int[11][11];
        chessArr[1][2] = 1 ; //黑棋
        chessArr[2][3] = 2 ; //白棋
        chessArr[4][5] = 2 ; //白棋

        //输出原始的二维数组
        System.out.println("原始的二维数组~~");
        for (int[] row : chessArr){
            for (int data :row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }


        /* 将二维数组 转换为 稀疏数组*/
        //1. 遍历二维数组， 得到非0数据的个数
        int sum =0;
        for (int i = 0; i <chessArr.length ; i++) {
            for (int j = 0; j <chessArr[0].length ; j++) {
                if (chessArr[i][j]!=0){
                    sum++;
                }
            }
        }

        //2.创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3]; // 第0行 原始数组的汇总
        sparseArr[0][0]=chessArr.length;
        sparseArr[0][1]=chessArr[0].length;
        sparseArr[0][2]=sum; //共sum个非0数据



        // 3. 将数据放入进稀疏数组
        int cur = 0 ;  //记录当前是第几个非0数组
        for (int i = 0; i <chessArr.length ; i++) {
            for (int j = 0; j <chessArr[0].length ; j++) {
                if (chessArr[i][j]!=0){
                    cur++;
                    sparseArr[cur][0]= i ; //第1列保存所在行数
                    sparseArr[cur][1]= j ; //第2列保存所在列数
                    sparseArr[cur][2]= chessArr[i][j] ; //第3列保存数据值

                }
            }
        }

        // 输出稀疏数组的形式
        System.out.println("--------------------------");
        System.out.println("对应的稀疏数组为~~");
        for (int i = 0; i <sparseArr.length ; i++) {
            System.out.printf("%d\t%d\t%d\t\n" , sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }


        // 将稀疏数组恢复成原始二维数组
        int row = sparseArr[0][0] ; //hang
        int col = sparseArr[0][1] ; //lie
        int[][]  arrRes  = new  int[row][col] ;

        System.out.println("恢复后的二维数组！！");
        for (int i = 1; i <sparseArr.length ; i++) {
            int curRow = sparseArr[i][0] ; //当前数据在二维数组里的行数
            int curCol = sparseArr[i][1] ; //当前数据在二维数组里的行数
            int curData = sparseArr[i][2] ; //当前数据
            arrRes[curRow][curCol] = curData;
        }


        for (int[] r : arrRes){
            for (int data :r){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
}
