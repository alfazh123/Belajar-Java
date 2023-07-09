package com.tutorial;

public class Unary {
    public static void main(String[] args){
        // unary = operasi pada satu variabel

        //unary + dan -
        int angka = 1;
        System.out.printf("unary '+' %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-' %d menjadi %d\n", angka, -angka);

        // unary decrement dan increment
        int angka1=10;
        angka1++;
        System.out.println(angka1);

        int angka2=10;
        angka2--;
        System.out.println(angka2);

        //prefix
        int a=5;
        System.out.println(++a);

        //postfix
        int b=5;
        System.out.println(b++);

        //unary boolean dengan ! untuk negasi
        boolean c = true;
        System.out.println(c);
        System.out.println(!c);

    }
}
