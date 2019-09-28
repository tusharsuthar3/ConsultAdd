package com.company;

public class WorkingWithArrays {
    public static void main( String[] args) {

        int[] a = {10, 20, 30, 40, 50, -10};
        int sum = 0;
        for(int i=0; i<a.length; i++ ) {
            if(a[i]>0)
                sum = sum + a[i];
        }
        System.out.println("Sum of the elements in the array is:"+sum);


        //Below Answer Done by Me --Tushar

        //int [] array = {10, 20, 30, 40, 50, 60, 20};
        //int sum = 0;

        //for (int num : array){
           // if(num > 0)
         //   sum = sum+num;

        //}
       // System.out.println("sum of array elements is" +sum);

    }




}
