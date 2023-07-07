package com.tutorial;

public class VariabelTipeData {
    public static void main(String[] args){
        //variabel
        int x=10; // Asignment
        System.out.println(x);

        int y; // Deklarasi
        y=20;
        System.out.println(y);

        // Catatan jangan menamai Variabel dengan nama yang telah digunakan pada fungsi Java
        // Seperti void, pakage, public, static, dan lain sebagainya lagi
        // penamaan variabel juga tidak diperbolehkan dimulai dengan angka

        // int void (salah, karena menggunakan nama yang biasa digunakan pada fungsi java)
        // int 1bola (salah, karena penulisaanya diawali dengan angka)
        // int rumah (benar)
        // int Rumah (benar)

        // Tipe Data
        //integer (bilangan bulat)
        int i=10;
        System.out.println("Nilai integer = " + i);

        //satuan byte
        byte b=10;
        System.out.println("Nilai byte = " + b);

        //satuan namun ukurannya lebih kecil daripada integer
        short s=10;
        System.out.println("Nilai short = " + s);

        //long merupakan bilangan bulat juga namun ukurannya lebih besar dari pada short dan integer
        long l=10L;
        System.out.println("Nilai long = " + l);

        //float merupakan bilangan desimal
        float f = 10.1f;
        System.out.println("Nilai float = " + f);

        //double juga bbilangan desimal namun memiliki ukuran yang lebih besar daripada float
        double d= 10.1d;
        System.out.println("Nilai double = " + d);

        //char merupakan suatu karakter besarnya hanya 2 bytes dan memiliki maksimal dan minimal besaran yaitu satu karakter
        //char dan string adalah dua hal yang berbeda dimana char adalah suatu karakter namun string adalah kumpulan dari beberapa karakter
        char c='c';
        System.out.println("Nilai char = " + c);

        //boolean merupakan tipe data yang berbeda dari yang lain dimana boolean sendiri adalah pernyataan benar (true) atau salah (false)
        boolean val=true;
        System.out.println("Nilai boolean = " + val);


    }
}
