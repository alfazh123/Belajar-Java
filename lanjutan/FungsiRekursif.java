package com.tutorial.lanjutan;

import java.util.Scanner;
public class FungsiRekursif {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int n,faktorial;

        System.out.print("Masukkan nilai yang akan diFaktorialkan : ");
        n = inputUser.nextInt();

        faktorial = faktorial(n);
        System.out.printf("Faktorial dari '%d' adalah : %d",n,faktorial);
    }

    public static int faktorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*faktorial(n-1);
        }
    }
}
