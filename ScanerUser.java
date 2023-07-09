package com.tutorial;

import java.util.Scanner;
public class ScanerUser {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("masukkan nilai panjang = ");
        int panjang = userInput.nextInt();
        System.out.println("panjang = " + panjang);

        System.out.print("masukkan nilai lebar = ");
        int lebar = userInput.nextInt();
        System.out.println("lebar = " + lebar);

        int luas = panjang * lebar ;
        System.out.println("Luas dari persegi panjang adalah = " + luas);

    }
}
