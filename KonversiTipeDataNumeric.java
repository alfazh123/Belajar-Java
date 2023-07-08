package com.tutorial;

public class KonversiTipeDataNumeric {
    public static void main(String[] args){
        int nilaiInt = 500; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        //Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        //Memperkecil rentang ke tipe data uang lebih kecil
        //Namun jika nilainya lebih dari nilai max dan minimumnya maka akan merubah nilai aslinya
        byte nilaiByte = (byte)nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai Max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai Min byte = " + Byte.MIN_VALUE);

        System.out.print("\n\n");


        //casting pembagian
        System.out.println("Casting pembagian :");

        int a=10;
        int b=4;

        float c = a/b;
        //jika kedua variabel yang dibagi adalah integer dan ingin hasil pembagiaanya adalah desimal
        //maka variabel hasil bisa dikeklarasikan dengan tipedata float
        System.out.printf("Hasil jika kedua bilangan integer dan hasil float = %f\n",c);

        //Jika kita ambil contoh dengan kedua variable diatas maka jawabannya adalah 2.0000
        //lalu bagaimana jika kita mnginginkan hasil 2.5, ada dua cara
        //Cara pertama, mengubah salah satu variabel menjadi float:
        int d = 10;
        float e = 4;

        float f = d/e;
        System.out.printf("Hasil jika salah satu variabel diubah menjadi float = %f\n",f);

        //Cara kedua, dengan menambahkan kurung float seperti cara memperkecil rentang ke tipe data yang lebih kecil
        //dan kedua variabel yang akan dibagi masih tetap integer
        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("Hasil dengan cara kedua = %f\n",z);
    }
}
