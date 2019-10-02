/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author hienanhpham
 */
public class bai3_kho {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ma trận bậc n : ");
        n = sc.nextInt();
        int mangA[][] = new int[n][n];
        int count = 0;
        System.out.println("Nhập các phần tử cho ma trận : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                mangA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mangA[i][j] + "\t");
            }
            System.out.println("\n");
        }

        //Đường chéo khi chỉ số A[i] = A[j] 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    count += mangA[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là : " + count);
    }

}
