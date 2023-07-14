package com.tutorial.lanjutan;

import java.lang.String;
public class OperasiString {
    public static void main(String[] args) {
        String kalimat = "halo dunia";
        System.out.println(kalimat);

        //mengambil komponen string
        System.out.println(kalimat.charAt(3));

        //Sub String
        String kata = kalimat.substring(5,10);
        System.out.println(kata);

        //concatenation (concat)
        String kalimat2 = kata + " ,Semua";
        System.out.println(kalimat2);

        //concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;// casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        //lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("dunia","kota");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        //equality (persamaan)
        String kalimatInput1 = "test";
        String kalimatInput2 = "test";
        String kalimatInput3 = new String("test");

        //dari ke-tiga variabel diatas bisa dilihat sama semua namun apakah
        //jika dilakukan percobaan menggunakan if else

        System.out.println("\nmengecek input1 dan input2 :");
        if (kalimatInput1==kalimatInput2){
            System.out.println("sama");
        }else{
            System.out.println("Tidak sama");
        }//disini akan mengeluarkan output sama karena hasil dari variabel string
        //masih berada pada string pool

        System.out.println("\nmengecek input1 dan input3 :");
        if (kalimatInput1==kalimatInput3){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }//sedangkan output dari percabangan yang inin adalah tidak sama
        // karena input3 tidak berada pada string pool
        // yang mengakibatkan address dari input1 dan 3 berbeda walau memiliki isi yang sama
        // dan yang diatas sama karena alamat dari kedua string tersebut sama

        System.out.println("\nmembandingkan input1 dan 3 dengan library String equal : ");
        if (kalimatInput1.equals(kalimatInput3)){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }

        //compare
        String mapel1 = "fisika";
        String mapel2 = "biologi";
        System.out.println(mapel1.compareTo(mapel2));
        //menghitungny dari b c d e f
        //                  | | | | |
        //                  0 1 2 3 4
        System.out.println(mapel2.compareTo(mapel1));
    }
}
