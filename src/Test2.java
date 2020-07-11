import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String... args) {
        int arr[] = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);


    }
   /* public static List<Integer> arrToList(Integer a[]){
        List<Integer> s =Arrays.asList(a);
        return s;
    }*/

    static void plusMinus(int[] arr) {

        double countPos = 0;
        double countNeg = 0;
        double countZero = 0;
        double pos;
        double neg;
        double zer;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
            } else if (arr[i] < 0) {
                countNeg++;
            } else {
                countZero++;
            }

        }

        pos = (countPos / arr.length);
        neg = (countNeg / arr.length);
        zer = (countZero / arr.length);

        System.out.printf("%.6f %n", pos);
        System.out.printf("%.6f %n", neg);
        System.out.printf("%.6f %n", zer);


    }

}
