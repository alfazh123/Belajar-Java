package com.tutorial.lanjutan;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        //assigment
        //tipeData[] nama = {komponen-komponen}
        //    index= 0 1 2 3
        //           | | | |
        int[] array={1,2,3,4};

        System.out.println(Arrays.toString(array));

        //Deklarasi
        //tipeData[] nama = new tipedata[JumlahArray]
        int[] Deklarasi = new int[4];
        Deklarasi[3] = 12;
        System.out.println(Arrays.toString(Deklarasi));

        //penamaan array yang lain
        int arrayAngka[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arrayAngka));

    }
}
