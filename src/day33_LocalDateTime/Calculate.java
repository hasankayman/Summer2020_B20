package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {
    /*
         1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals

    */
    public static int addition(int a, int b) {
        return a + b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double addition(double a, int b) {
        return a + b;
    }

    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static double multiplication (double a, double b) {
        return a * b;
    }



    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 10;
        System.out.println(addition(num1, num2));
        System.out.println(multiplication(num1,num2));

        int num3 = 710;
        double num4 = 10;
        System.out.println(addition(num3, num4));// implicit casting to double happens
        System.out.println(addition(num3, (int) num4)); // explicit casting to int happens
        System.out.println(multiplication(num3,num4));

        float num5 = 10;
        float num6 = 8;
        System.out.println(addition(num5, num6)); // implicit casting to double happens
        System.out.println(addition((int) num5, (int) num6)); // explicit casting to int happens
        System.out.println(multiplication(num5,num6));

        double num7 = 10;
        int num8 = 7;
        System.out.println(addition(num7, num8));
        System.out.println(addition(10, 25));  // result is 35
        System.out.println(addition(10, 25.0));  // result is 35.0
        System.out.println(addition(0.5, 11));  // third method with a double and a int parameter will run
        System.out.println(multiplication(0.5, 10)); // result is 5.0


        // A Java method overloading samples: sort and toString
        int[] intarray = {4,2,5,9,1};
        Arrays.sort(intarray);
        System.out.println(Arrays.toString(intarray));
        char[] chararray = {'a','s','n','h'};
        Arrays.sort(chararray);
        System.out.println(Arrays.toString(chararray));


    }
}
