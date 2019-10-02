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
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        //Bai1
        int mangA[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            mangA[i] = sc.nextInt();
            sum += mangA[i];
        }
        System.out.println("Tổng các phần tử trong mảng :" + sum);
    }
   
}
