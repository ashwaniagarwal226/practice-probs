import java.util.Arrays;

public class Test3 {

    /*Given five positive integers,
    find the minimum and maximum values that can be
    calculated by summing exactly four of the five integers.
    Then print the respective minimum and maximum values as a
    single line of two space-separated long integers.

    For example, arr= [1,3,5,7,9] .
    Our minimum sum is 1+3+5+7 =16 and our maximum sum is 3+5+7+9 =24.
    We would print 16 24 */

    public static void main(String [] args) {

        Long arr[]={256741038L,623958417L,467905213L,714532089L,938071625L};
        Long minSum=0L;Long maxSum=0L;
        Arrays.sort(arr);
        for(int i=0;i<(arr.length-1);i++){
           minSum = minSum + arr[i];
        }
        for(int j=(arr.length-1);j>0;j--){
            maxSum = maxSum + arr[j];
        }
        System.out.println(minSum + " "+ maxSum);

    }




}
