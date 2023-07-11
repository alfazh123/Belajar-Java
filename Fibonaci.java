package com.tutorial;

import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int n;
        int hasil=0;

        System.out.print("Mauskkan panjang fibbonaci : ");
        n = inputUser.nextInt();

        int f0=0;
        int f1=1;



        if((n==0) || (n==1)){
            hasil=n;
            System.out.printf("Nilai Fibonaci ke-%d adalah %d",n,hasil);
        }else{
            for(int i=2; i<=n; i++){
                hasil = f0 + f1;
                f0=f1;
                f1=hasil;
            }
            System.out.printf("Nilai Fibonaci ke-%d adalah %d",n,hasil);
        }
    }
}
