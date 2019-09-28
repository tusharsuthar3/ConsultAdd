package com.company;

import java.util.Scanner;
// break concept with loop
public class Loop {

    // Task 2 // 4
    /*4. Write a program in JAVA to break and continue if the following cases occurs:
         If user enters a negative number just break the loop and print “It’s Over” */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

       do {
           System.out.println("Enter number 1");
           int number1 = keyboard.nextInt();

           System.out.println("Enter number 2");
           int number2 = keyboard.nextInt();
           if (number2 == 0){
               break;
           }

           System.out.println(number1 + "*" + number2 + " is " +(number1*number2));


       } while (true);

        System.out.println("Its Over");


    }

}

