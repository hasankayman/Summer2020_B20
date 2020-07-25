package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        DecimalFormat df3 = new DecimalFormat("0.000");
        DecimalFormat dfdollar = new DecimalFormat("$ 0.00");
        double a = 22.0 / 7;
        System.out.println(a);
        System.out.println(df2.format(a));
        System.out.println(df3.format(a));
        System.out.println(df3.format(3.66666666666666666666666666666666));
        System.out.println(df2.format(2));
        System.out.println(dfdollar.format(30));
    }
}
