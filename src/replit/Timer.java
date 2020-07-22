package replit;

public class Timer {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 20; i++) {
            switch (i) {
                case 0 : i+=2;
                case 1 : i+=3;
                case 2: i+=2;
                case 3 : i+=3;
                default:i+=3;

            }
            System.out.printf("i val: %d\n",i);

        }
    }
}
