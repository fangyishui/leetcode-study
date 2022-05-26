package com.sparsearray;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.LinkedList;

public class SparseArray {

    public static void main(String[] args) {

        //创建一个 11* 11的数组
        //0 表示没有棋子 1 黑子 2 篮子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出原始二维数组
        System.out.println("原始的二维数组~~");
        for (int[] row: chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组 转 稀疏数组
        //先遍历二维数组 得到非0数据的个数
        System.out.println("遍历的二维数组~~");

        int sum = 0;
        for (int i =0; i< 11 ; i++){
            for (int j = 0;  j< 11 ; j++){
                if(chessArr1[i][j] != 0){
                    System.out.println(chessArr1[i][j]);
                    sum++;

                }
            }
        }
        //2.创建对应的稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        sparseArr[0][0] = chessArr1.length;
        sparseArr[0][1] = chessArr1.length;
        sparseArr[0][2] = sum;


    }
}
