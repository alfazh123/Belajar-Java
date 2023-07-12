package com.tutorial.lanjutan;

import java.util.Arrays;
public class ArrayforEach {
    public static void main(String[] args){

        int[] arrayAngka = {0,1,2,3,4,5,6,7,8,9};


        //looping standart
        for (int i=0; i<10; i++){
            System.out.println("index ke-"+i+" adalah "+arrayAngka[i]);
        }

        //looping dengan properti array
        System.out.print("\n\n");
        for (int i=0; i<arrayAngka.length; i++){
            System.out.println("index ke-"+i+" adalah "+arrayAngka[i]);
        }

        //looping untuk collection <- array
        System.out.print("\n\n");
        for ( int angka : arrayAngka){
            System.out.println("angka pada looping ini "+angka);
            //namun hal ini hanya dilakukan jika index sudah tidak berlaku
        }
    }
}
