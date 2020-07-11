import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String... args) {
        System.out.println(removedDuplicate("mississippi"));
        System.out.println(removeDup("mississippi"));
        System.out.println(removeDuplicate("mississippi"));


    }

    private static String removedDuplicate(String input) {

        String finalSt = "";
        char array[] = input.toCharArray();
        Set<String> removed = new LinkedHashSet<>();
        for (char a : array) {
            removed.add(String.valueOf(a));
        }
        return removed.stream().map(s -> finalSt + s).collect(Collectors.joining());
    }

    private static String removeDup(String string) {
        int i = 0;
        String finalString = "";
        for (i = 0; i < string.length(); i++) {
            char single = string.charAt(i);
            if (finalString.indexOf(single) == -1) {
                finalString = finalString + single;
            }
        }

        return finalString;
    }

    static String removeDuplicate(String string) {
        char str[] = string.toCharArray();
        int n = string.length();
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
