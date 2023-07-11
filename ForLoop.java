package com.tutorial;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        //For Loop
        System.out.println("Perulangan Menggunakan For Loop");
        int a;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir dari perulangan For Loop : ");
        a = inputUser.nextInt();

        for(int i=0; i<=a; i++){
            System.out.println("Perulangan ke-" + i);
        }

        //Nested Loop

        int b=5,c=5;
        System.out.println("\n\nPerulangan Nested Loop Menggunakan For Loop");

        for (int i=0; i<b; i++){
            for (int j=0; j<c; j++){
                System.out.printf("%d%d ",i,j);
            }
            System.out.println();
        }

        // Hasil akhir dari program tersebut
        // jika dimasukkan pada suatu kotak
        // maka akan tersusun seperti dibawah ini

        //       00 01 02 03 04
        //       10 11 12 13 14
        //       20 21 22 23 24
        //       30 31 32 33 34
        //       40 41 42 43 44

        System.out.print("\n\n");

        //NestedLoop Persegi
        for (int i=0; i<b; i++){
            for (int j=0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\n\n");


        //NestedLoop Segitiga siku2 kanan
        for (int i=0; i<b; i++){
            for (int j=0; j<c; j++){
                System.out.print("* ");
                if(j==i){
                    j=c;
                }
            }
            System.out.println();
        }
        System.out.print("\n\n");

        //NestedLoop Segitiga
        for (int i=0; i<b; i++){
            for (int j=0; j<c; j++){
                System.out.print("* ");
                if(j==i){
                    break;
                } else if((i+j)==4){
                    break;
                }
            }
            System.out.println();
        }
        System.out.print("\n\n");



    }
}
