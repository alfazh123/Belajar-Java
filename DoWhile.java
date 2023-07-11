package com.tutorial;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        int a;
        int b = 0;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir dari perulangan : ");
        a = inputUser.nextInt();

        do{
            System.out.println("Perulangan ke-"+b);
            b++;
        }while(b<=a);
    }
}
