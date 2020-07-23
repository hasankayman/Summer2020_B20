package day32_MethodOverloading;

import java.util.Scanner;

public class CalculatorMethod {
    /*
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result

     */
    // +,-,*,/,%
    public static double calculator(double num1, char oper, double num2) {
        double result = oper == '+' ? num1 + num2 : oper == '-' ? num1 - num2 :
                oper == '*' ? num1 * num2 : oper == '/' ? num1 / num2 :
                        oper == '%' ? num1 % num2 : 0;

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number:");
        int firstnum = scan.nextInt();
        System.out.println("operator:");
        char operator = scan.next().charAt(0);
        System.out.println("Second number:");
        int secondnum = scan.nextInt();

        System.out.println(calculator(firstnum,operator,secondnum));

    }
}
