package com.tutorial.lanjutan;

import java.util.Formatter;
public class FormatString {
    public static void main(String[] args) {
        String nama = "Budi";
        int umur = 17;

        //output : Nama saya Budi, umur saya 17 tahun
        System.out.println("Nama saya " + nama + ", umur saya " + umur + "tahun");

        //output yang sama amenggunakan format string
        System.out.printf("Nama saya %s, umur saya %d tahun\n",nama,umur);

        //conversion :
        //  f = floating point
        //  d = integer
        //  c = character
        //  s = string
        //  b = boolean

        //struktur format = %(conversion) || %(argumen_index$)(flags)(.precision)conversion

        //(argumen_index$)
        System.out.printf("%1$s, sedang bersama %1$s\n",nama);

        System.out.printf("\nberapa umur %1$s : \numur %1$s adalah %2$d\n",nama,umur);

        //(flags)
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 + int2;
        System.out.printf("%d + %d = %+d\n",int1,int2,hasil);
        //untuk menampilkan plus dan minus dari suatu variabel

        //(widht)
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%6d\n",int3);
        System.out.printf("%-2d\n",int3);
        System.out.printf("%+6d\n",int3);
        System.out.printf("%+6d\n",int3);
        System.out.printf("% 6d\n",int3);
        System.out.printf("%07d\n",int3);// flags = "0" menambahkan o didepannya
        System.out.printf("%+07d\n",int3);
        System.out.printf("%,4d\n",int3);// flags = ", " menandakan delimeter per seribu


        System.out.println("FLOATING POINT");
        float float1 = 1.356f;
        System.out.printf("%f\n",float1);
        System.out.printf("%+9f\n",float1);// floating point akan mengambil width dengan 6 desimal dibelkang koma


        // (.precision)
        System.out.println("\nprecision");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%.3f\n",float2);
        System.out.printf("%8.2f\n",float2); // menggabungkan dengan width
        System.out.printf("%+08.2f\n",float2); // menggabungkan dengan width


        //contoh
        String nama2 = "Ucup";
        float IPK = 3.785f;

        System.out.printf("\nIPK %1$s berapa?,\n%1$s : saya dapat %2$+.2f\n\n",nama2,IPK);

        //kesimpulan
        String info_format = String.format("nama : %s, IPK = %2$+.2f\n",nama2,IPK);
        System.out.println("info format : \n" + info_format);

        //save format ke String builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama : %s, IPK = %2$+.2f\n",nama2,IPK);
        System.out.println("Format Builder : \n" + formatBuilder);
    }
}
