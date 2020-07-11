import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewTest {

    public static void main(String... args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(11);
        l1.add(2);
        l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Integer> l3 = new ArrayList<>();
        l3.add(10);
        l3.add(8);
        l3.add(-12);

        arr.add(l1);
        arr.add(l2);
        arr.add(l3);
        System.out.println("diss" +diagonalDifference(arr));
        //diagonalDifference(arr);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        int diff = 0;
        for (int i = 0; i < arr.size(); i++) {
           /* rightDiagonal = rightDiagonal + arr.get(i).get(i);
            leftDiagonal = leftDiagonal + arr.get(i).get(arr.size()-1-i);*/
            System.out.println("\n");
           for (int j = 0 ;j<arr.get(i).size();j++){

               System.out.print(arr.get(i).get(j) +"\t");
           }
        }
        if(rightDiagonal>leftDiagonal){
            diff = rightDiagonal - leftDiagonal;
        }else if (leftDiagonal > rightDiagonal){
            diff = leftDiagonal - rightDiagonal;
        }else {
            diff = 0;
        }
        return diff;
    }

}
