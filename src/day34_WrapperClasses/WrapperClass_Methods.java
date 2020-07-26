package day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str);

        System.out.println(str + 1); // prints 1231
        System.out.println(a + 1);   // prints 124

        String input = "7.5";
        Double doubleValue = Double.parseDouble(input); //
        System.out.println(input);   // prints it as string value
        System.out.println(doubleValue); // prints it as double value
        System.out.println(input + 2.5);   // prints 7.52.5
        System.out.println(doubleValue + 2.5); // prints 10.0

        System.out.println("*******************************************");
        String s2 = "10000000.50";
        Double.valueOf(s2);


    }
}
