package com.tutorial.lanjutan;

import java.util.Scanner;
public class LatihanFungsi {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int panjang,lebar,luas,keliling;

        System.out.print("Masukkan panjang : ");
        panjang = inputUser.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = inputUser.nextInt();

        System.out.printf("Gambar persegi panjang dengan panjang '%d' dan lebar '%d' adalah sebagai berikut\n",panjang,lebar);
        gambar(panjang,lebar);

        luas = luas(panjang,lebar);
        System.out.printf("Luas dair persegi panjang dengan panjang '%d' dan lebar '%d' adalah '%d'",panjang,lebar,luas );
        System.out.print("\n");

        keliling = keliling(panjang,lebar);
        System.out.printf("Keliling dair persegi panjang dengan panjang '%d' dan lebar '%d' adalah '%d'",panjang,lebar,keliling );
        System.out.print("\n");
    }

    public static void gambar(int panjang, int lebar){
        for (int i=0; i<panjang; i++){
            for (int j=0; j<lebar; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static int luas(int panjang, int lebar){
        int luas = panjang * lebar;

        return luas;
    }

    public static int keliling(int panjang, int lebar){
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
