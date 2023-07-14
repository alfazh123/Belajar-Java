package com.tutorial.lanjutan;

import java.util.Arrays;
public class PengenalanString {
    public static void main(String[] args) {
        //membuat string
        String kalimat = "halo dunia";

        char[] kataChar = {'h','a','l','l','o'};

        // menampilkan string
        System.out.println(kalimat);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen string
        System.out.println("Komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("Komponen pertama dari String kalimat = " + kalimat.charAt(0));

        //merubah komponen dari string
        // tidak bisa mengubah string namun yang bisa dirubah ialah char
        kataChar[0] = 'b';

        System.out.println(Arrays.toString(kataChar));

        //namun kita bisa mengubahnya secara tidak langsung

        printAddres("kalimat", kalimat);
        kalimat = "c" + kalimat.substring(0,7);

        System.out.println(kalimat);
        printAddres("Kalimat", kalimat);

        String test1 = "test";
        String test2 = "halo";
        String test3 = "halo Semua";

        printAddres("test1",test1);
        printAddres("test2",test2);
        printAddres("test3", test3);
        test3 = test3.substring(0,4);
        printAddres("test3",test3);
    }

    private static void printAddres(String nama,String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
