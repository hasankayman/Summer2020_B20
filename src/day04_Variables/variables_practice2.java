package day04_Variables;

public class variables_practice2 {
    public static void main(String[] args) {
        int iNum = 50;
        long lNum = iNum;

        float fNum = lNum;

        float fNum123 = 500;
        float num$ = 1000;

        int num1 = 1_000_000;

        int num2;

        num2 = 5000; // bu satir matematikteki gibi num2 5000dir demek degil num2 degeri 5000 olarak atansin demek

        num2 = 2000; // bu satir bir onceki satirda degeri 5000 olarak atanan num2 degiskenin degeri 2000 olarak atansin demek

        System.out.println(num1);

        System.out.println(fNum);
        System.out.println(fNum123);

    }
}
