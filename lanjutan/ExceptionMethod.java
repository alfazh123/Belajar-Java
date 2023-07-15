package com.tutorial.lanjutan;

import java.util.Scanner;

public class ExceptionMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr1 = { 0,1,2,3,4};
        System.out.print("Masukkan data index : ");
        int index = input.nextInt();

        //execption biasa
        System.out.println("Exception biasa");
        try{
            System.out.printf("data dari index ke-%d adalah %d \n",index,arr1[index]);
        } catch(Exception e){
            System.err.println("nilai index tidak ditemukan");
        }

        //Exception dalam fungsi
        System.out.println("\nException dari fungsi");
        int data = ambilDataArray(arr1,index);
        System.out.printf("data dari index ke-%d adalah %d \n\n",index,data);


        //Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData(arr1,index);
        } catch (Exception e){
            System.out.println("nilai index tidak ditemukan ");
        }
        System.out.printf("data dari array ke-%d adalah %d \n\n",index,data2);



        System.out.println("Akhir dari program");


    }

    private static int ambilData(int[] arr, int index) throws Exception{
        int hasil = arr[index];
        return hasil;
    }

    private static int ambilDataArray(int[] arr, int index){
        int hasil = 0;

        try{
            hasil = arr[index];
        } catch (Exception e){
            System.err.println("nilai index tidak ditemukan");
        }

        return hasil;

    }
}
