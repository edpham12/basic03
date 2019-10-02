/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.util.Scanner;
/**
 *
 * @author hienanhpham
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhap vao so thu " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        int sum = 0;
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            sum = sum + mang[i];
        }
        System.out.println("Tong cua cac so trong mang la: " + sum);
    }
    
}
