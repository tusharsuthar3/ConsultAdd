package com.company;

import java.util.Scanner;

public class UserInput {

    //Task 2 // 3. 	Write a program to print the value given by the user.

    public static void main(String[] args) {
        // User Input

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Full Name");
        String name = in.nextLine();

        System.out.println("Hi " + name + " Welcome to Fitness Point" );

        System.out.println("Enter Your Age");
        int age = in.nextInt();

        System.out.println("Enter Your Phone Number");
        long wt = in.nextLong();

        System.out.println("Which Are you Live ?");
        String Address  = in.next();


        System.out.println("What is your Height");
        float ht = in.nextFloat();

        System.out.println("What is your Weight");
        double nextDouble = in.nextDouble();

        System.out.println("Purpose of joining gym.");
        String s = in.next();

        System.out.println("Thank You " + name + " For Joining Fitness Point. Enjoy Your Work Out" );

    }
}
