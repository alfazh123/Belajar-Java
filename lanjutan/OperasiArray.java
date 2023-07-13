package com.tutorial.lanjutan;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class OperasiArray {
    public static void main(String[] args) {

        int[] arrayAngka1={1,2,3,4,5};

        //merubah array menjadi string
        System.out.println("\nMenrubah array menjadi string");
        printArray(arrayAngka1);
        System.out.print("\n\n");

        //mengkopi array
        System.out.println("\nMengkopi array");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("Mengkopi dengan loop");
        for (int i=0; i<arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        System.out.print("\n\n");

        System.out.println("Mengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        System.out.print("\n\n");

        System.out.println("Mengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        System.out.print("\n\n");

        // fill array
        System.out.println("\nFill array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        System.out.print("\n\n");

        //komparasi array
        System.out.println("\nKomparasi array");
        int[] arrayAngka6 = {1,2,3,4};
        int[] arrayAngka7 = {1,2,3,4};

        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini tidak sama");
        }

        System.out.println("\nMengecek array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        //0 sama besar
        //1 lebih besar
        //-1 lebih kecil

        System.out.println("\nMengecek index mana yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort array
        System.out.println("\nSort array");
        int[] arrayAngka8 = {7,9,8,1,2,3,4,5,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\nsearch array");
        printArray(arrayAngka8);
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        // -->tugas sort kebalik
        // sort terbalik
        System.out.println("\nMembalik hasil sort");
        int[] arrayAngka9 = {4,2,5,3,6,1};
        printArray(arrayAngka9);
        System.out.println(arrayAngka9);
        membalikSort(arrayAngka9);
        System.out.println(arrayAngka9);

        // operasi tambah antara dua array
        System.out.println("\nMenambahkan dua array");
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        tambahArray(arrayAngka1,arrayAngka2); // fungsi ini tidak bisa dipakai jika panjang dari salah satu array ada yang lebih besar

        // menggabungkan dia buah array
        System.out.println("\nMenggabungkan dua Array");
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        menggabungArrays(arrayAngka1,arrayAngka2);
    }

    private static void menggabungArrays (int[] array1, int[] array2) {
        int n = array1.length+array2.length;
        int[] arrayGabung = new int[n];
        int length2 = 0;

        for (int i=0; i<array1.length; i++){
            arrayGabung[i] = array1[i];
        }

        for (int i=array1.length; i<n; i++){
            arrayGabung[i] = array2[length2];
            length2++;
        }

        System.out.println(Arrays.toString(arrayGabung));
        System.out.println(arrayGabung);
    }

    private static void tambahArray(int[] array1, int[] array2){
        int n;

        if (array1.length>=array2.length){
            n=array1.length;
        }else{
            n=array2.length;
        }
        int[] hasilArray = new int[n];

        for (int i=0; i<n; i++){
            hasilArray[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(hasilArray));
        System.out.println(hasilArray);
    }

    private static void membalikSort(int[] array){
        Arrays.sort(array);
        int[] sortTerbalik = new int[array.length];
        int n=array.length;

        for (int i=0; i<array.length; i++){
            sortTerbalik[i]=array[n-1];
            n--;
        }

        System.out.println("array = "+Arrays.toString(sortTerbalik));
    }
    public static void printArray(int[] dataArray){
        System.out.println("array = "+Arrays.toString(dataArray));
    }
}
