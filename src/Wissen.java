import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wissen {

    static Map<String, List<Integer>> data = new HashMap<>();

    public static void main(String[] args) {

        putNewInnings("Virat", 100);
        putNewInnings("Virat", 70);
        putNewInnings("robin", 12);
        putNewInnings("robin", 12);
        putNewInnings("Virat", 20);
        putNewInnings("robin", 12);
        putNewInnings("robin", 100);
        putNewInnings("robin", 400);

        System.out.println(data);
        System.out.println(getAverageRuns("Virat"));

    }

    public static void putNewInnings(String player, int runs) {
        List<Integer> run = data.get(player);
        if (run == null || run.size() == 0) {
            run = new ArrayList<>();
        }
        run.add(runs);
        data.put(player, run);
    }

    static public double getAverageRuns(String player) {
        // YOUR CODE HERE
        List<Integer> runs = data.get(player);
        int sum = 0;
        for (Integer ss : runs) {
            sum = sum + ss;
        }
        double avg = Double.valueOf(sum) / Double.valueOf(runs.size());
        return avg;
    }
}
