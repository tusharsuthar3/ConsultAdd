package com.company;

import java.util.Scanner;

public class Calculator {

    //Task 2//
    /*2. Write a program in JAVA to perform the following operator based task:
    //Ask user to choose the following option first:
    //If User Enter 1 - Addition
    //If User Enter 2 - Subtraction
    //If User Enter 3 - Division
    //If User Enter 4 - Multiplication
    //If User Enter 5 - Average */
    public static void main(String[] args) {
        int a,b,choice;
        float result =0;

        Scanner buf=new Scanner(System.in);

        System.out.println("Enter Number One");
        a=buf.nextInt();
        System.out.println("Enter Number Second");
        b=buf.nextInt();

        System.out.println("n\1: Addition.");
        b=buf.nextInt();
        System.out.println("\n2:Substraction");
        b=buf.nextInt();
        System.out.println("n\3: Multiplicatin.");
        b=buf.nextInt();
        System.out.println("\n4:Devide");
        b=buf.nextInt();
        System.out.println("n\5: Remainder.");
        b=buf.nextInt();
        System.out.println("\n6: Exit");
        b=buf.nextInt();
        System.out.println("\nEnter Your Choice: ");
        choice=buf.nextInt();

        switch (choice){
            case 1:
                result=(a+b); break;
            case 2:
                result=(a-b); break;
            case 3:
                result=(a*b); break;
            case 4:
                result=(float)((float)a/(float)b); break;
            case 5:
                result=(a%b); break;
            default:
                System.out.println("You Made Invalid Choice!!\n");
        }

        if (choice>1 && choice<=5)
            System.out.println("Result is; " +result);


    }

}

