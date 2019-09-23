/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author hienanhpham
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // bai1a
        double S = 2.5;
        double G = 3.8;
        double ketQua;
        System.out.println("Cho 2 so thuc S = 2.5, G = 3.8");
        ketQua = S + G;
        System.out.println("ket qua cua S+G la : " + ketQua);
        ketQua = S - G;
        System.out.println("ket qua cua S-G la : " + ketQua);
        ketQua = S * G;
        System.out.println("ket qua cua S * G la : " + ketQua);
        ketQua = S / G;
        System.out.println("ket qua cua S / G la : " + ketQua);
        ketQua = Math.pow(S, G); // Hàm mũ số thực, S^G = e^(G*lnS) ??
        System.out.println("ket qua cua S mũ G la : " + ketQua);

        //bai1b
        float A = 4;
        float B = 4;
        float C = 1;
        float result;
        System.out.println("Cho phuong trinh bac 2 nhu sau : " + A + "x^2 +" + B + "x +" + C + " = 0");
        //kiem tra phuong trinh vo nghiem hoac co 1 nghiem
        if (A == 0) {
            if (B == 0 && C != 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (B == 0 && C == 0) {
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                result = -C / B;
                System.out.println("phuong trinh co nghiem 1 nghiem x = -C/B : " + result);
            }
        }
        // neu khong thi tinh delta
        if (A != 0 || B != 0 || C != 0) {
            float delta = B*B - 4*A*C;
            float nghiem1;
            float nghiem2;
            // delta > 0
            if (delta > 0) {
                nghiem1 = (float) ((-B + Math.sqrt(delta)) / (2 * A));
                nghiem2 = (float) ((-B - Math.sqrt(delta)) / (2 * A));
                System.out.println("phuong trinh co 2 nghiem x1 la " + nghiem1 + " va x2 la " + nghiem2);
            } else if (delta == 0 && A != 0) {
                nghiem1 = (-B / (2 * A));
                System.out.println("phuong trinh co nghiem kep x = " + nghiem1);
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }

}
