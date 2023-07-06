package com.tutorial;

public class Main {
    public static void main(String[] args){
        // '\n' diperuntukkan memberikan baris baru kepada kalimat berikutnya penggunaannya pada dalam kalimat seperti berikut
        // output:
        /* PR kemarin sudah belum kamu
           Udah dong


         */
        System.out.print("PR kemarin sudah belum kamu \n");
        System.out.print("Udah dong \n\n");

        // 'println' akan mengeluarkan kalimat disetai line baru untuk kalimat keduanya
        //output
        /* Hai Budi
           Hai Kevin

           */
        System.out.println("Hai Budi");
        System.out.println("Hai Kevin\n");

        // 'print' akan mengeluarkan duakata yang berada pada satu baris
        // karena tidak menggunakan ln yang dimana bertugas untuk memberikan baris baru kepada kalimat berikutnya
        //output
        /* Hai kamu mau kemana Hanya berkeliling */
        System.out.print("Hai kamu mau kemana ");
        System.out.print("Hanya berkeliling\n\n");

        // 'printf' print format diperuntukkan untuk memasukkan angka
        //output
        /* Nilai ujian mu berapa
           Nilai ujian ku 90 */
        System.out.println("Nilai ujian mu berapa");
        System.out.printf("Nilai ujian ku %d \n", 90);
    }
}
