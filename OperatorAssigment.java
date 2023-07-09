package com.tutorial;

public class OperatorAssigment {
    public static void main(String[] args){
        //Operator Assigment

        int a=1;
        a = a + 3;
        System.out.println(a);

        //penjumlahan
        int b=3;
        b+=5;
        System.out.println(b);

        //pengurangan
        b-=4;
        System.out.println(b);

        //perkalian
        b*=3;
        System.out.println(b);

        //pembagian
        b/=2;
        System.out.println(b);

        //modulus
        b%=5;
        System.out.println(b);


        /*--------------------------------------------------------------*/
        // Operator Komparasi

        // Persamaan
        System.out.println("Persamaan :");
        int x,y;
        boolean isTrue;
        x=2;
        y=3;
        isTrue=(x==y);
        System.out.printf("%d == %d --> %s\n",x,y,isTrue);

        x=3;
        y=3;
        isTrue=(x==y);
        System.out.printf("%d == %d --> %s\n\n",x,y,isTrue);


        // Pertidak samaan
        System.out.println("Pertidaksamaan :");
        boolean isFalse;
        x=2;
        y=3;
        isFalse=(x!=y);
        System.out.printf("%d != %d --> %s\n",x,y,isFalse);

        x=2;
        y=2;
        isFalse=(x!=y);
        System.out.printf("%d != %d --> %s\n\n",x,y,isFalse);


        //Kurang dari
        System.out.println("Kurang dari : ");
        boolean LessThan;
        x=2;
        y=2;
        LessThan=(x<y);
        System.out.printf("%d < %d --> %s\n",x,y,LessThan);

        x=2;
        y=3;
        LessThan=(x<y);
        System.out.printf("%d < %d --> %s\n\n",x,y,LessThan);


        //Lebih dari
        System.out.println("Lebih dari : ");
        boolean GreaterThan;
        x=3;
        y=2;
        GreaterThan=(x>y);
        System.out.printf("%d > %d --> %s\n",x,y,GreaterThan);

        x=3;
        y=3;
        GreaterThan=(x>y);
        System.out.printf("%d > %d --> %s\n\n",x,y,GreaterThan);


        // Kurang dari dan sama dengan
        System.out.println("Kurang dari dan sama dengan : ");
        boolean LessThanandEqual;
        x=2;
        y=3;
        LessThanandEqual=(x<=y);
        System.out.printf("%d <= %d --> %s\n", x,y,LessThanandEqual);

        x=3;
        y=2;
        LessThanandEqual=(x<=y);
        System.out.printf("%d <= %d --> %s\n\n", x,y,LessThanandEqual);


        // Lebih dari dan sama dengan
        System.out.println("Lebih dari dan sama dengan : ");
        boolean GratherThanandEqual;
        x=2;
        y=3;
        GratherThanandEqual=(x>=y);
        System.out.printf("%d >= %d --> %s\n",x,y,GratherThanandEqual);

        x=3;
        y=2;
        GratherThanandEqual=(x>=y);;
        System.out.printf("%d >= %d --> %s\n\n",x,y,GratherThanandEqual);



    }
}
