/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author hienanhpham
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("bello");
        /*
        // operators ( + - * / % )
        int a = 7;
        int b = 2;
        int ketQua = a / b;
        int phanDu = a % b;
        System.out.println("in ra gia tri a: " + a);
        System.out.println("in ra gia tri b: " + b);
        System.out.println("in ra gia tri a/b: " + ketQua);
        System.out.println("in ra gia tri a%b: " + phanDu);
        */
        /*
        int A = 12;
        int B = 9;
        int ketQua;
        System.out.println("phep cong A + B = ");
        ketQua = A + B;
        System.out.println(ketQua);
        
        System.out.println("phep tru A - B = ");
        ketQua = A - B;
        System.out.println(ketQua);
        
        System.out.println("phep chia lay phan nguyen A / B = ");
        ketQua = A / B;
        System.out.println(ketQua);
        
        System.out.println("phep chia lay du A % B = ");
        ketQua = A % B;
        System.out.println(ketQua);
        
        boolean dieukien;
        dieukien = true;
        dieukien = false;
        */
        
        int a = 10;
        int b = 0;
        // a hoac b phai la so thuc, ep kieu neu bat buoc ko duoc doi kieu du lieu a,b.
        // neu a ==0; b==0 => Vo so nghiem 0x + 0 = 0
        // neu a==0; b!=0 => Vo nghiem
        // ax + b =0. Tim x
        if(a == 0 && b == 0){
            System.out.println("vo so nghiem");
        }    
        if(a == 0 && b != 0){
            System.out.println("vo nghiem");
        }
        if(a!=0){
            System.out.println("Tim x trong ax + b =0, a = 10, b =6");
        float x = -b/(float)a;
            System.out.println("ket qua X la " + x);
        }
        
        
        
    }

}
