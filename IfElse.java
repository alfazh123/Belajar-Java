package com.tutorial;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){

        // IF ELSE statement
        int a = 5;
        if(a<2){
            System.out.println("Nilai 'a' kurang dari 2");
        }else{
            System.out.println("Nilai 'a' lebih dari 2");
        }

        //IF ELSE IF statement
        int b = 10;
        if(b%2==1){
            System.out.println("Nilai 'b' adalah ganjil");
        }else if(b%2==0){
            System.out.println("Nilai 'b' adalah genap");
        }

        //NESTED IF setatement
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicek : ");
        long c = userInput.nextLong();
        if ((c==2) || (c==3) || (c==5)){
            System.out.printf("Nilai '%d' adalah bilangan prima",c);
        }else if(c%2!=0){
            if((c%3==0) || (c%5==0)){
                System.out.printf("Nilai '%d' bukan bilangan prima",c);
            }else{
                System.out.printf("Nilai '%d' adalah bilangan prima",c);
            }
        }else{
            System.out.printf("Nilai '%d' bukan bialngan prima",c);
        }


    }
}
