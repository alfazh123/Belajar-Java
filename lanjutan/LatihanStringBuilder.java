package com.tutorial.lanjutan;

import java.lang.StringBuilder;
public class LatihanStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);


        //append
        builder.append(" dunia");
        printData(builder);

        builder.append(" ,apa kabar semuanya");
        printData(builder);

        //insert
        builder.insert(22, "disini ");
        printData(builder);

        //delete
        builder.delete(22,29);
        printData(builder);

        //rubah karakter pada index tertentu
        builder.setCharAt(0,'H');
        printData(builder);

        //replace
        builder.replace(5,10,"Kota");
        printData(builder);

        // casting menjdai string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int adressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(adressBuilder) + "\n");
    }
}
