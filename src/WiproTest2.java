import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WiproTest2 {

    public static void main(String[] args) {
        int array[] = {10, 5, 50,98,33};
        int newArr[] = array.clone();
        char charAr[] = new char[array.length];

        Arrays.sort(newArr);

        Map<Integer, Character> hh = new HashMap();
        char t ='a';

        for (int i = 0; i < newArr.length; i++) {
            hh.put(newArr[i],t++);

        }
        for(int a =0 ;a<array.length;a ++){
            System.out.println(hh.get(array[a]));
        }
    }
}
