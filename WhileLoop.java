package com.tutorial;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int a;
        int b;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai awal untuk perulangan : ");
        a = inputUser.nextInt();
        System.out.print("Masukkan berapa kali perulangannya : ");
        b = inputUser.nextInt();

        while(a<=b){
            System.out.println("Melakukan perulangan ke-"+a);
            a++;
        }
    }
}
