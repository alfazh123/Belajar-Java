package com.tutorial;

public class OperatorBiwise {
    public static void main(String[] args){
        // Operator Bitwise
        byte a = 4;
        byte b,c;
        String a_bits,b_bits,c_bits;

        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);

        // Operator SHIFT LEFT
        System.out.println("-----------SHIFT LEFT");
        b = (byte) (a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);

        //SHIFT RIGHT
        System.out.println("-----------SHIFT Right");
        c= (byte) (b >> 3);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits,c);
    }
}
