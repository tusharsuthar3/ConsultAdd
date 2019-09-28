package com.company;

public class Swap {

    // Task 1
    // 2.Swap two numbers using third variable as result name and do the same task without using any third variable.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap a is: "+a);
        System.out.println("Before swap b is: "+b);

        //Swap Method

        a = a + b; // 10+20=30

        b = a - b; //10-20=10

        a = a - b; //30 - 10 =20

        System.out.println("After swap a is: "+a);
        System.out.println("After swap b is: "+b);

            /*
            float x = 2.8F;
            float y = 8.9F;

            float temp;

            temp - x;
            x = y;
            y = temp;

            System.out.println("After swap x is: " +x);
            System.out.println("After swap y is: " +y);
    /*

             */
        int x = 6;
        int y = 9;
        System.out.println("Before swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("----------------------------------");
        System.out.println("After Swap");

        int temp = 0;

        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
