import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InteractiveBrokers {

    public static void main(String... args) {
        int[] ar = {3, 2, 1, 3};
        birthdayCakeCandles(ar);

    }

    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == max) {
                count++;
            }
        }
        return count;
    }


}
