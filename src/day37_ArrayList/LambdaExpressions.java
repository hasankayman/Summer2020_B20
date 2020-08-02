package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9));

        //Predicate<Integer>  lessThan5 =  p -> p < 5 ;
        // list.removeIf( lessThan5  );

        list.removeIf(p -> p < 5);

        System.out.println(list);

        System.out.println("=========================================");

        Predicate<Integer> oddNumbers = p -> p % 2 != 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        numbers.removeIf(oddNumbers);  //remove if the number is odd
        numbers.removeIf(p -> p % 2 == 0);  // remove if the number is even

        System.out.println(numbers);

        System.out.println("=======================================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"));

        names.removeIf(p -> p.startsWith("M"));

        System.out.println(names);
        System.out.println("==========================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 2, 4, 2, 5, 5, 8, 1, 7, 3, 2, 9, 5, 2, 4, 6));
        nums.removeIf(num -> Collections.frequency(nums, num) != 1);
        System.out.println(nums);
        System.out.println("==================");

        ArrayList<Character> charTable = new ArrayList<>();
        for (int i = 0; i <= 255; i++) {
            charTable.add((char) i);
        }
        charTable.removeIf(each -> Character.isDigit(each) || Character.isLetter(each));
        System.out.println(charTable);
        System.out.println("************************************************");
        ArrayList<Character> charTable2 = new ArrayList<>();
        for (int i = 0; i <= 255; i++) {
            charTable2.add((char) i);
        }
        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(charTable2);
        digits.removeIf(each -> !Character.isDigit(each));
        System.out.println(digits);
        System.out.println("The maximum is " + Collections.max(digits));

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(charTable2);
        letters.removeIf(each -> !Character.isLetter(each));
        System.out.println(letters);

        ArrayList<Character> specialChars = new ArrayList<>();
        specialChars.addAll(charTable2);
        specialChars.removeIf(each -> Character.isLetterOrDigit(each));
        System.out.println(specialChars);



    }
}
