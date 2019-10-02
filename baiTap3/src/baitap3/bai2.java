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
public class bai2 {

    public static void main(String[] args) {
        // TODO code application logic here    
        //Bai1
        int mangA[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            mangA[i] = sc.nextInt();
        }
        System.out.println("Phần tử chia hết cho 2 trong mảng là : ");
        for (int i = 0; i < 10; i++) {
            if (mangA[i] % 2 == 0) {
                sum = sum + mangA[i];
                System.out.print(mangA[i] + ", ");
            }
        }
        System.out.println("\n");
        
        System.out.println("Tổng các số chẵn trong mảng là " + sum);
        System.out.println("\n");
        
        System.out.println("Phần tử ở vị trí chẵn trong mảng là : ");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(mangA[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Phần tử ở vị trí lẻ trong mảng là : ");
        for (int i = 1; i < 10; i += 3) {
            System.out.print(mangA[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Phần tử chia hết cho 5 dư 1 trong mảng là : ");
        for (int i = 1; i < 10; i++) {
            if (mangA[i] % 5 == 1) {
                System.out.print(mangA[i] + ", ");
            }
        }
    }

}
