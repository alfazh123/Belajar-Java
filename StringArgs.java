package com.tutorial;

public class StringArgs {
    public static void main(String[] args){
        //args[] digunakan untuk menangkap segala sesuatu yang ada dibelakang dari si-java main kita,
        // jadi jika kita ingin memasukkan perintah atau suatu kata menuju fungsi main ini maka harus memasukkannya dari terminal atau comand line

        // jika kita memasukkan pada terminal adalah Halo maka args[0] akan mengeluarkan 'Halo'
        // namun jika pada fungsi main ini ada args[0] args[1] dan seterusnya dan
        // anggap saja yang dimasukkan ke terminal hanya 'Halo' maka akan mengeluarkan error karena yang diminta dari
        // fungsi main lebih dari satu cara kerjanya hampir sama seperti array

        System.out.println(args[0]);
        System.out.println("Halo semuanya");
    }
}
