import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) throws FileNotFoundException {
        int arr[][] = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};

        Scanner sc = new Scanner(new BufferedReader(new FileReader("read.txt")));
        int [][] myArray = new int[100000][3];
        while(sc.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j=0; j<line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }

        //10000000 100000
        Instant start =Instant.now();
        System.out.println(arrayManipulation(10000000, myArray));
        Instant end =Instant.now();

        long timeElapsed = Duration.between(start, end).toMillis();
        System.out.println(timeElapsed);

    }

    static long arrayManipulation(int n, int[][] queries) {
        System.out.println("start");
        long array[] = new long[n];

        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int numAdd = queries[i][2];

            for (int k = (startIndex - 1); k < endIndex; k++) {
                array[k] = numAdd + array[k];
            }

        }


       /* Arrays.sort(array);
        return array[array.length - 1];*/
        /*Arrays.parallelSort(array);
        return array[array.length - 1];*/
        //return Arrays.stream(array).max().getAsLong();
        System.out.println("return");
        return Arrays.stream(array).parallel().max().getAsLong();
    }

}
