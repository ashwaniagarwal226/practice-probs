import java.util.HashSet;
import java.util.Set;

public class CommonString {

    public static void main(String[] args) {
        String string1 = "wipro";
        String string2 = "Technologies";
        int input = 0;

        Set<String> h1 = new HashSet<>();
        Set<String> h2 = new HashSet<>();
        String result = "";
        for (int i = 0; i < string1.length(); i++) {
            h1.add(String.valueOf(string1.charAt(i)));
        }
        for (int i = 0; i < string2.length(); i++) {
            h2.add(String.valueOf(string2.charAt(i)));
        }
        h1.retainAll(h2);
        if (input == 1) {
            System.out.println(h1);
        } else {

            for (int i = 0; i < string2.length(); i++) {
                String s = String.valueOf(string2.charAt(i));
                if (h1.contains(s)) {
                    result = result + s;
                }

            }
            System.out.println(result);
        }


    }
}
