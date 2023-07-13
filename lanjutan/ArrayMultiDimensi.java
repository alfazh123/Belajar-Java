package com.tutorial.lanjutan;

import java.util.Arrays;
public class ArrayMultiDimensi {
    public static void main(String[] args){
        // array 2 dimensi

        int[][] array_2D = {
                            {1,2},
                            {3,4},
                            {5,6}
                            };
        printArray2D(array_2D);

        // array 2D dengan deklarasi
        int[][] array1 = new int[3][4];

        int[][] array2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for (int i=0; i<array2.length; i++){
            for (int j=0; j<array2[i].length; j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("\nJika dalam for each");
        for (int[] baris:array2){
            for (int kolom: baris){
                System.out.print(kolom+" ");
            }
            System.out.println();
        }

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(array_2D[2]);
        System.out.println(Arrays.deepToString(array_2D));

        System.out.println();

        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e','f'};

        char[][] arrayChar_2D = {array_char1,array_char2};

        System.out.println(array_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }

    private static void printArray2D(int[][]  array){
        System.out.println(Arrays.deepToString(array));
    }
}
