package com.company;

public class ReverseString {


    // Method to convert characters
    // of a string to opposite case
    static void convertOpposite(StringBuffer str)
    {
        int ln = str.length();

        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");

        }
    }
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello i am taking training with consultadd");
        // Calling the Method
        convertOpposite(str);

        System.out.println(str);







        //String String = "abcdefgh";
        //String reverse = new
          //      StringBuffer(String).reverse().toString();
        //System.out.println("\nString before reverse: "+String);
        //System.out.println("\nString after reverse: "+reverse);


       // String s[] = "i like this program very much".split(" ");
        //String ans = "";
        //for (int i = s.length - 1; i >= 0; i--) {
          //  ans += s[i] + " ";
        //}
        //System.out.println("Reversed String:");
        //System.out.println(ans.substring(0, ans.length() - 1));
    }
}
