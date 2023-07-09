package com.tutorial;

public class OperatorBitwise {
    public static void main(String[] args){
        // Operator Bitwise
        byte a = 4;
        byte b,c,d;
        String a_bits,b_bits,c_bits,d_bits;

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

        // Operator bitwise OR
        System.out.println("-----------BITWISE OR : ");
        a=32;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b=16;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        d = (byte) (a|b);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');
        System.out.printf("%s = %d \n",d_bits,d);

        // Operator bitwise AND
        System.out.println("-----------BITWISE AND : ");
        a=48;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b=16;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        d = (byte) (a&b);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');
        System.out.printf("%s = %d \n",d_bits,d);

        // Operator bitwise XOR
        System.out.println("-----------BITWISE XOR : ");
        a=48;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b=16;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits,b);
        d = (byte) (a^b);
        d_bits = String.format("%8s",Integer.toBinaryString(d)).replace(' ','0');
        System.out.printf("%s = %d \n",d_bits,d);

        // Operator Negasi/NOT
        System.out.println("-----------BITWISE NO/NEGASI : ");
        a=65;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b= (byte) (~a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits,b);
    }
}
