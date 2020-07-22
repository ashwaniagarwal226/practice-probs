import java.util.*;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Production {

    public static long planProduction(List<Integer> worstCase, List<Integer> expected) {
        List finalData = new ArrayList();

        // Write your code here
        Collections.sort(expected);
        System.out.println(expected);
        int max = worstCase.stream().mapToInt(a -> a).sum();
        System.out.println(max);
        int moneyleft = 0;

        for (int i = 0; i < max; i++) {

            /*for()*/

        }


        return 0;
    }

    public static int getAmount(int amount, List<Integer> wor) {

        return 0;
    }

    public static void main(String... args) {

        List wor = Arrays.asList(6, 5, 7, 8);
        List exp = Arrays.asList(4, 2, 1, 1);

        planProduction(wor, exp);

/*
List<String> lines = Arrays.asList("foo;bar;baz","","qux;norf");
lines.stream().flatMap(line->Arrays.stream(line.split(";"))).forEach(str->System.out.print(str+":"));
*/

/*
String s1 ="Hello";
String s2 =new String(s1);
String s3 = "Hello";

//        System.out.println(s1.equals(s2) + " "+ (s2==s3));

        Comparator<String> comparer =(country1,country2)->country2.compareTo(country1);

        String [] brics ={"Brazil","Russia","India","China"};
        Arrays.sort(brics,null);
        Arrays.stream(brics).forEach(country -> System.out.print(country +" "));


        IntFunction<UnaryOperator<Integer>> func =i ->j->i*j;

        int s=func.apply(10).apply(20);
        System.out.println(s);
        boolean result = Stream.of("do","re","mi","fa","so","la","ti")
                .filter(str->str.length()>5).peek(System.out::println).
                        allMatch(str->str.length()>5);

        System.out.println(result);


*/



    }
}
