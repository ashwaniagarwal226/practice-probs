import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {

        //int arr[] = {1, 3, 5, 7, 9};
        int arr[] = {1,2,3,4,5};
        int i;
        int sum = 0;
        List<Integer> sumAll = new ArrayList<>();

        for (i = 0; i < arr.length; i++) {
            //sum = sum +arr[i];
            for(int j=(i+1);j<(arr.length-1);j++){
               sum =sum + arr[j];
               sumAll.add(sum);
            }

        }

        /*for (i = 0; i < arr.length; i++) {
            sumAll.add((sum - arr[i]));
        }*/
        System.out.println(sumAll);


    }
}
