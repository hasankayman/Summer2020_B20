package SelfStudy;

public class PairTheSocks {
    public static void main(String[] args) {
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20, 10, 40,40,40,40,40,40,40,20,20,30};
        // 2 + 2 + 1 + 3
        int i, j, count, pair, allmatches = 0;
        for (i = 0; i < socks.length; i++) {
            count = 0;
            for (j = 0; j < socks.length; j++) {
                if (socks[i] != 999 && socks[i] == socks[j]) {
                    ++count;

                }
            }
            pair = count / 2;
            allmatches += pair;

            for (int k = socks.length - 1; k >= 0; k--) {
                if(socks[i] == socks[k]) {
                    socks[k] = 999;
                }
            }
        }
        System.out.println(allmatches);
    }

}
