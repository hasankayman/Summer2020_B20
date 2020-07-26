package SelfStudy;

public class replit_178 {
    public static String mergeStrings(String one, String two) {
        String newword = "";
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length()) {
                newword += one.charAt(i);
            }
            if (i < two.length()) {
                newword += two.charAt(i);
            }
        }
        return newword;
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("kazim", "orhan"));
    }
}
