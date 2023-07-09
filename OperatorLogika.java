package com.tutorial;

public class OperatorLogika {
    public static void main(String[] args){
        // AND (&&), OR (||), NOT (!), XOR (^)

        boolean a =true;
        boolean b =false;
        boolean c;

        // AND
        c = a && b;
        System.out.println(c);

        // OR
        c = a || b;
        System.out.println(c);

        // NOT
        c = !a;
        System.out.println(c);

        c = !b;
        System.out.println(c);

        // XOR
        c = a ^ b;
        System.out.println(c);
    }
}
