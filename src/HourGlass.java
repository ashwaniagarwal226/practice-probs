import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/2d-array/problem
public class HourGlass {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };
        System.out.println(hourglassSum(arr));
    }


    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int sum = 0;
                if (isValidIndex(i, j)) {
                    sum = sum + arr[i][j] + arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j - 1] + arr[i + 2][j + 1];
                    sums.add(sum);
                }

            }

        }
        return sums.stream().mapToInt(value -> value).max().orElse(-1);
    }

    static boolean isValidIndex(int i, int j) {
        //where 5 is n
        if ((j - 1 >= 0 && j + 1 <= 5) && ((i + 2) <= 5)) {
            return true;
        } else {
            return false;
        }
    }
}
