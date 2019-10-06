/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author hienanhpham
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Scanner sc = new Scanner(System.in);
        int length = 1; //input
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        // in ra toan bo mang
        System.out.println("Truoc khi sap xep");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i] + " ");
        }

        int slpt = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("Dang so sanh : " + i + " va " + j);
                slpt++; // min = n*log2(n)
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sau khi sap xep " + slpt + " phep tinh");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i] + " ");
        }

         */
        String[] danhSachHoTen = {
            "A",
            "D",
            "C",
            "F",
            "E",};

        int[] diem = {3, 6, 2, 8, 9};
        for (int i = 0; i < diem.length - 1; i++) {
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] < diem[j]) {
                    int temp1 = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp1;
                    String t = danhSachHoTen[i];
                    danhSachHoTen[i] = danhSachHoTen[j];
                    danhSachHoTen[j] = t;
                }
            }
        }
        for (int i = 0; i < danhSachHoTen.length; i++) {
            System.out.println("Danh sach ho ten theo diem " + diem[i] + "\t" + danhSachHoTen[i]);
        }

    }

}
