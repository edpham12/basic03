/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author hienanhpham
 */
public class BaiTap2 {

    private static boolean check_prime(int k) {
        if (k < 2) {
            return false;
        } else {
            int root = (int) Math.sqrt(k);
            for (int i = 2; i <= root; i++) {
                if (k % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nguyenTo = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon " + nguyenTo + " la : ");
        for (int i = 1; i < nguyenTo; i++) {
            if (check_prime(i)) {
                System.out.println(i);
            }
        }
    }

    
    
    
}
