package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

// Task 2//
//1.	Write a program in JAVA to perform the following operation:
//If a number is divisible by 3 it should print “Consultadd” as a string
//If a number is divisible by 5 it should print “JAVA Training” as a string
//If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.//



public class DecisionMaking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int n = scan.nextInt();
        System.out.println(n);

        if (n > 35){
            System.out.println("No Content");
            int number = scan.nextInt();
        } else if (n == 3){
            System.out.println("Consult Add");

        } else if (n == 5){
            System.out.println("Java Training");
        }
        else {
            System.out.println("Consult Add Training");
        }


        // Ask How to get the result by 3 and 5 = ConsultAdd Training
        // May be i am having some mistake in this code>> Can you please explain




    }
}
