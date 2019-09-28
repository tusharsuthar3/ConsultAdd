package com.company;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //Task 2 // 4
        // If user enters a positive number just continue in the loop and print “Good Going” //
        Scanner keyboard1 = new Scanner(System.in);
        do {

            System.out.println("Enter number 1");
            int number1 = keyboard1.nextInt();

            System.out.println("Enter number 2");
            int number2 = keyboard1.nextInt();

            if (number2 == 0) {
                continue;
            }

            System.out.println(number1 + "*" + number2 + " is " + (number1 * number2));
            System.out.println("Going Good");
        } while (true);






    }
}
