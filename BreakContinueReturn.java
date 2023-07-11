package com.tutorial;

public class BreakContinueReturn {
    public static void main(String[] args){
        int a = 0 ;

        while(true){
            a++;
            if(a==10){
                break; //berfungsi untuk memaksa  fungsi berhenti
            }else if(a==5){
                continue;
            } else if (a==7) {
                return;
            }
            System.out.println("Perulangan ke-" + a);
        }

        System.out.println("Akhir dari fungsi");


    }
}
