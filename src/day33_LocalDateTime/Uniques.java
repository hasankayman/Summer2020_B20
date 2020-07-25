package day33_LocalDateTime;

public class Uniques {
    public static void uniqueInArray(int[] array) {
        for (int element : array) {
            int count = 0;
            for (int each : array) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }

    }

    public static void uniqueInArray(double[] array) {
        for (double element : array) {
            int count = 0;
            for (double each : array) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }

    }

    public static void uniqueInArray(String[] array) {
        for (String element : array) {
            int count = 0;
            for (String each : array) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }

    }

    public static void uniqueInArray(char[] array) {
        for (char element : array) {
            int count = 0;
            for (char each : array) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] myarray = {1, 2, 4, 8, 2, 4, 9, 1, 10};
        uniqueInArray(myarray);
    }
}
