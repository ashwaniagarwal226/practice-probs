import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
/*
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }*/
        int a[] = {41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51};
        //         77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77
        int d = 10;
        getLeftRotationArray(a, d);

    }

    public static int[] getLeftRotationArray(int[] a, int d) {
        int n = a.length;
        int finalarr[] = new int[n];
        Map<Integer, Integer> indexMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.put(a[i], (i - d));
        }
        //map is replacing duplicate key values handle that
        indexMap.replaceAll((integer, integer2) -> {
            if (integer2 < 0) {
                integer2 = n + integer2;
            }
            return integer2;
        });
        indexMap.forEach((integer, integer2) -> {

            finalarr[indexMap.get(integer)] = integer;
        });
        Arrays.stream(finalarr).forEach(s->{
            System.out.print(s+" ");
        });
        return finalarr;
    }
}
