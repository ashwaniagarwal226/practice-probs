import java.util.ArrayList;
import java.util.List;

public class MoRStan {
    //
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 9, 1, 1};
        int b[] = {4, 6, 7, 2, 1, 10, 1};
        //1,1,2,4
        getCommon(a, b).forEach(System.out::println);
    }


    static List getCommon(int[] arr1, int[] arr2) {
        List<Integer> resuIntegers = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if(!index.contains(j)){
                    if (arr2[j] == arr1[i]) {
                        resuIntegers.add(arr1[i]);
                        index.add(j);
                        break;
                    }
                }


            }
        }
        return resuIntegers;
    }

}
