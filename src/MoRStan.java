import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MoRStan {
    //
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 9, 1, 1};
        int b[] = {4, 6, 7, 2, 1, 10, 1};
        //1,1,2,4
        getCommon(a, b).forEach((o, o2) -> {
            System.out.println(o2);
        });
    }


    static Map getCommon(int[] arr1, int[] arr2) {
        Map<Integer,Integer> maps = new LinkedHashMap();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(!maps.containsKey(j)){
                    if (arr2[j] == arr1[i]) {
                        maps.put(j,arr1[i]);
                        break;
                    }
                }


            }
        }

        return maps;
    }

}
