/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author hienanhpham
 */
public class Nhan {

    // psvm (tab)
    public static void main(String[] args) {
        long x = 123245;
        long y = 758247;
        int d = 0;
        while (y > 0) {
            long r = y % 10;
            y = y / 10;
            long multi = r * x;
            String s = "";
            for (int i = 0; i < d; i++) {
                s = s + "-";
            }
            System.out.printf(multi+s);
            d = d + 1;
        }

        //System.out.println(x*r);
    }
}
