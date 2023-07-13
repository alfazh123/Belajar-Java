package com.tutorial.lanjutan;

import java.util.Arrays;
public class LatihanArrayMatrix {
    public static void main(String[] args) {

        int[][] Matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] Matrix2 = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };

        printMatrix(Matrix1);
        System.out.print("\n");
        printMatrix(Matrix2);
        System.out.print("\n");

        //penjumlahan matrix
        int[][] hasilTambah = tambah(Matrix1,Matrix2);
        printMatrix(hasilTambah);
        System.out.print("\n");

        //perkalian matrix
        int[][] hasiKali = perkalian(Matrix1,Matrix2);
        System.out.print("\n");
        printMatrix(hasiKali);
    }

    private static int[][] perkalian(int[][] arr1, int[][] arr2){
        int baris1 = arr1.length;
        int kolom1 = arr1[0].length;

        int baris2 = arr2.length;
        int kolom2 = arr2[0].length;

        int[][] hasil = new int[baris1][kolom2];

        int buffer;
        for (int i=0; i<baris1; i++){
            for (int j=0; j<kolom2; j++){
                buffer = 0;
                for (int k=0; k<kolom1; k++){
                    buffer += arr1[i][k] * arr2[k][j];
                }
                hasil[i][j] =buffer;
            }
        }

        return hasil;
    }

    private static int[][] tambah(int[][] arr1, int[][] arr2){
        int baris = arr1.length;
        int kolom = arr1[0].length;

        int baris1 = arr2.length;
        int kolom1 = arr2[0].length;

        int[][] hasil =new int[baris][kolom];

        if (baris == baris1 && kolom == kolom1){
            for (int i=0; i<baris; i++){
                for (int j=0; j<kolom; j++){
                    hasil[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }

        return hasil;

    }

    private static void printMatrix(int[][] dataMatrix){
        int baris = dataMatrix.length;
        int kolom = dataMatrix[0].length;

        for (int i=0; i<baris; i++){
            System.out.print("[");
            for (int j=0; j<kolom ;j++){
                System.out.print(dataMatrix[i][j]);
                System.out.print(",");
            }
            System.out.println("]");
        }
    }
}
