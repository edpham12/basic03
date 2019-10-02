/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author hienanhpham
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mangA[] = {23, 45, 92, 21, 32, 45, 68};
        int length = mangA.length;
        for (int i = mangA.length - 1; i >= 0; i--) {
            System.out.println("Index \t" + i);
            System.out.println("Value \t" + mangA[i]);
        }
        // Datatype nameVar[];
        String sample = "abcdf abc abc abcdsf as cv abc";
        char c = 'a';
        System.out.println("Length: \t" + sample.length());
        //Bai toan tim kiem 1 phan tu trong mang
        int mangB[] = {2, 3, 4, 9, 6, 0, 8, 2, 3, 5, 2, 3, 2, 2};
        int k = 2;
        boolean timThay = false;
        // hoac dung int dem = 0;
        for (int i = 0; i < mangB.length; i++) {
            if (k == mangB[i]) {
                System.out.println("tim thay k trong mang B tai vi tri " + i);
                timThay = true;
                //dem = dem+1;
            }
        }
        if (timThay == false) {
            System.out.println("Khong tim thay");
        }
        int dem1 = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (c == sample.charAt(i)) {
                System.out.println("tim thay ki tu "+ c+ " tai vi tri " + i + " trong mang");
                dem1++;
            }
        }
        if (dem1 == 0) {
            System.out.println("khong tim thay "+ c +" tai vi tri nao");
        }
    int[] arrayA = {1, 3, 9, 5, 3, 2, 1, 2, 9, 9, 5, 4, 5};    
    // in ra thong tin ve mang
    // sum()
    // tim ra cac phan tu chia 5 du 1
    // tim ra cac phan tu la so nguyen to
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Cac phan tu trong mang la" + arrayA[i]);
        }
        for (int i = 0; i < arrayA.length; i++) {
           
        }
        
        
        for (int i = 0; i < arrayA.length; i++) {
        if(arrayA[i]%5==1){
            System.out.println("Cac phan tu trong mang chia 5 du 1 la " + arrayA[i] +" ");
        }    
        }
    
    
    }

}
