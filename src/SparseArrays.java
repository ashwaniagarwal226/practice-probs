import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {
/*
    Challenge-Sparse Arrays
    There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.

    For example, given input
    Strings=[‘ab’,’ab’,’abc’]and q
    queries =[‘ab’,’abc’,’bc’], we find 2 instances of ‘ab’, 1 of ‘abc’ and 0 of ‘bc’. For each query, we add an element to our return array,
    results=[2,1,0] .

    Function Description

    Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

    matchingStrings has the following parameters:

    strings – an array of strings to search
    queries – an array of query strings
    Input Format

    The first line contains and integer n, the size of strings.
    Each of the next n lines contains a string strings[i].
    The next line containsq , the size of queries .
    Each of the next q lines contains a string q[i].
*/


    public static void main(String... args) {

        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};
        matchingStrings(strings, queries);

    }

    public static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        //With for Each

        /*int k=0;
        for (String query : queries) {
            int count = 0;
            for (String s : strings) {
                if (query.equals(s)) {
                    count++;
                }
            }
            result[k++]=count;
        }*/
        //Without ForEach
        for(int i = 0 ;i<queries.length;i++){
            int count=0;
            for(int j=0;j<strings.length;j++){
                if(queries[i].equals(strings[j])){
                    count++;
                }
            }
            result[i]=count;
        }


        return result;
    }
}
