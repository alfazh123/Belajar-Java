package com.tutorial;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){

        int input;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("1. Kantor");
        System.out.println("2. Sekolah");
        System.out.println("3. Taman");
        System.out.print("Masukkan pilihan tempat : ");
        input = inputUser.nextInt();

        switch (input){
            case 1:
                System.out.println("Tempat yang kamu pilih adalah Kantor");
                break;
            case 2:
                System.out.println("Tempat yang kamu pilih adalah Sekolah");
                break;
            case 3:
                System.out.println("Tempat yang kamu pilih adalah Taman");
                break;
            default:
                System.out.printf("Tidak ada pilihan untuk nomer '%d'\n",input);
        }

        System.out.println("Terimakasi telah memilih");
    }
}
