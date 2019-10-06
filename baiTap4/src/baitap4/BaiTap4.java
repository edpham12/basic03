/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.Scanner;

/**
 *
 * @author hienanhpham
 */
public class BaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Bài 1
        int[] mang1 = {2, 3, 1, 3, 2};
        System.out.println("Các phần tử trong mảng là : ");
        for (int i = 0; i < mang1.length; i++) {
            System.out.print(mang1[i] + ", ");
        }
        boolean dx = doixung(mang1);
        System.out.println(dx);

        //Bài 2
        System.out.println("\n");
        int s = 30;
        boolean nt = nguyento(s);
        System.out.println(nt);

        //Bài 3
        System.out.println("\n");
        char[] mang2 = {'m', 'b', 'k', 's', 'g'};
        char[] sk_sx = sapxep(mang2);
        System.out.print("Chuỗi sau khi đã sắp xếp : ");
        for (int i = 0; i < mang2.length; i++) {
            System.out.print(mang2[i] + ", ");
        }
        //Bài 4
        System.out.println("\n");
        int kt_sx = kiemtra(mang1);
        System.out.println(kt_sx);

    }

    public static boolean doixung(int A[]) {
        int dodai = A.length;
        for (int i = 0; i < dodai / 2; i++) {
            if (A[i] != A[dodai - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean nguyento(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static char[] sapxep(char[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    char td = n[i];
                    n[i] = n[j];
                    n[j] = td;
                }
            }
        }
        return n;
    }

    public static int kiemtra(int[] n) {
        int dodai = n.length;

        if (n[0] < n[dodai - 1]) {
            for (int i = 0; i < dodai - 1; i++) {
                if (n[i] > n[i + 1]) {
                    return 0;
                }
                return 1;
            }
        }

        if (n[0] > n[dodai - 1]) {
            for (int i = 0; i < dodai - 1; i++) {
                if (n[i] < n[i + 1]) {
                    return 0;
                }
                return -1;
            }
        }
        return 0;
    }

}
