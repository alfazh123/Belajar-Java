package com.tutorial.lanjutan;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
public class MenanganiExeption {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan index yang ingin dicari : ");
        int index = input.nextInt();

        //exeption handling (try, catch, finally)
        try{
            System.out.printf("index ke-%d, adalah %d\n",index,arr1[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Masukkan index array tidak sesuai");
        }

        //runtime jika file tidak ada
        FileInputStream fileInput = null;

        try{
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e){
            System.err.println("file tidak dapat ditemukan");
        }

        //menggunakan dua exception
        try {
            System.out.printf("index ke-%d, adalah %d\n",index,arr1[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Masukkan index array tidak sesuai");
        } catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        try {
            System.out.printf("index ke-%d, adalah %d\n",index,arr1[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("masukan index array tidak sesuai");
        } finally {
            System.out.println("finally");
        }


        System.out.println("\nakhir dari program");


    }
}
