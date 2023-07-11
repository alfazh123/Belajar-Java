package com.tutorial;

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        
        int input;
        boolean cekBenar= true,cek;
        String hasil;

        Scanner inputUser=new Scanner(System.in);
        
        System.out.println("Mengecek apakah nilai input genap atau ganjil");
        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

        //ternery operator
        cek = (input%2==0) ? (cekBenar) : (!cekBenar);

        hasil = (cek==true) ? (hasil="Genap") : (hasil="Ganjil");

        System.out.printf("Nilai '%d' adalah %s",input,hasil);
    }
}
