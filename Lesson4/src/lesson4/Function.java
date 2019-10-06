/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author hienanhpham
 */
public class Function {

    public static void main(String[] args) {
        String[] dS = {
            "Hey",
            "This",
            "Is",
            "Me"

        };
        int[] score = {9, 2, 3, 8};
        String[] ketQuaMain = lietke(dS, score);
        for (int i = 0; i < ketQuaMain.length; i++) {
            System.out.println(ketQuaMain[i]);
        }
        
        int x = 13;
        boolean languyento = soNguyenTo(x);
        System.out.println(+x +"la so nguyen to");
    }

    //Function
    static String[] lietke(String[] hoten, int diem[]) {
        String[] ketQuaTraVe = new String[hoten.length];

        for (int i = 0; i < hoten.length; i++) {
            ketQuaTraVe[i] = hoten[i] + " duoc " + diem[i];
        }
        return ketQuaTraVe;
    }
    
    //Kiem tra so nguyen to
    public static boolean soNguyenTo(int a){
        int count = 0;
        for (int i = 1; i < a; i++) {
            if(a%i==0){
            count++;
            }
        }
        if(count==2){
        return true;
        }
        else {
        return false;
        }
    }
    //Kiem tra tinh tang dan
    public static boolean checkTangDan(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
            return false;
            }
        }
        return true;
    }
    
}
