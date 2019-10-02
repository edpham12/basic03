/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author hienanhpham
 */
import java.util.Scanner;

public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Vong Lap
       /* for (int i = 0; i < 5; i++) {
            System.out.println("vong lap ngoai " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("    vong lap trong " + i + ": " + j);
                if (i == 3 && j == 1) {
                    break;
                }
            }
        }
        */
        //Code lai pt bac 2
       /*
        float a = 5;
        float b = 3;
        float c = 2;
        float delta = b * b - 4 * a * c;
        System.out.println("Cho phuong trinh bac 2 voi a = " + a + "b= " + b + "c " + c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Chuong trinh vo nghiem");
                } else {
                    System.out.println("Chuong trinh vo nghiem");
                }
            } else {
                System.out.println("Chuong trinh co 1 nghiem duy nhat" + (-c / b));
            }
        }
        if (a != 0 && delta > 0) {
            float x1 = (float) ((-b + Math.sqrt(delta) / (2 * a)));
            float x2 = (float) ((-b + Math.sqrt(delta) / (2 * a)));
            System.out.println("phuong trinh co 2 nghiem la x1 va x2 lan luot la: " + x1 + x2);
            
        }
        */
       
        // Nhap vao k, in ra moi so chia het cho 2 va be hon k
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        /*
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                System.out.println("cac gia tri chia het cho 2 va nho hon k la " + i);
            }
        }
        for (int j = 0; j < k; j = j + 2) {
            System.out.println("cac gia tri chia het cho 2 va nho hon k dinh hon la " + j);
        }
        */
        int count = 0;
        for (int i = 1; i < k+1; i++) {
            if(k%i == 0){
                System.out.println("Uoc cua K bao gom "  +i);
                count++;
            }
        }
        System.out.println("so luong uoc " +count);
        if(count==2){
            System.out.println("K la so nguyen so ");
        }
        else{
            System.out.println("K la hop so");
        }
        
        
        
        
        
        
        
        // end of main function 
    }

}
