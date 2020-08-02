package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyofChars {
    public static void main(String[] args) {
        String str = "AABBCDD";
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, str.split(""));
        System.out.println(list);

        String nonDup = Util.removeDup(str);
        for (String each : nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }
    }
}
