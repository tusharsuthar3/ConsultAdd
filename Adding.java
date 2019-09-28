package com.company;


import java.util.Scanner;

public class Adding {

        // Task 1
        /* 4. Write a program to complete the task given below:
         Ask user to enter any 2 numbers in between 1-10 and add both of them to another variable  call z.
          Use z for adding 30 into it and print the final result by using variable result. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scan.nextInt();

        System.out.println("Enter another number");
        int b = scan.nextInt();

        int z = a + b;

        System.out.println(z);
        int result = scan.nextInt();


        System.out.println("Your Final Result is " + (result + z ));


    }



}
