package SelfStudy;

public class PairTheSocks {
    public static void main(String[] args) {
        int[] socks = {10, 20, 20, 10, 10, 30,20,20,30};

        int i, j, count, pair, allmatches = 0;
        for (i = 0; i < socks.length; i++) {
            count = 0;
            for (j = 0; j < socks.length; j++) {
                if (socks[i] != 999 && socks[i] == socks[j]) { // assume there is no color code as 999
                    ++count; // count how many single socks there are in the same color

                }
            }
            pair = count / 2; // pair the single socks
            allmatches += pair;  // add pair number

            for (int k = socks.length - 1; k >= 0; k--) {
                if(socks[i] == socks[k]) {
                    socks[k] = 999;  // change color code of the socks you counted.
                }
            }
        }
        System.out.println(allmatches);
    }

}
