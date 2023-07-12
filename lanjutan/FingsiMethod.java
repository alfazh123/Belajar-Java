package com.tutorial.lanjutan;

import java.util.Scanner;

public class FingsiMethod {
    public static void main(String[] args){
        //Menghitung luas persegi dengan fungsi
        int panjang,lebar,Luas;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        panjang = inputUser.nextInt();
        System.out.print("Masukkan Lebar : ");
        lebar = inputUser.nextInt();

        Luas = hitung(panjang,lebar);
        System.out.printf("Luas persegi dengan panjang '%d' dan lebar '%d' adalah '%d'",panjang,lebar,Luas);

    }

    public static int hitung(int panjang, int lebar){
        int luas = panjang * lebar;

        return luas;
    }
}
