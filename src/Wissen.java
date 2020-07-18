import java.util.HashMap;
import java.util.Map;

public class Wissen {

   static Map<String,String> data = new HashMap<String,String>();

    public static void main(String[] args) {

        putNewInnings("Virat",100);
        putNewInnings("Virat",70);
        putNewInnings("robin",12);
        putNewInnings("Virat",20);

        System.out.println(data);
        System.out.println(getAverageRuns("Virat"));

    }

    public static void putNewInnings(String player, int runs){
        String run = data.get(player);
                if(run == null){
                    run = Integer.toString(runs)+",";
                    data.put(player,run);
                }else{
                    run = run + Integer.toString(runs)+",";
                    data.put(player,run);
                }
    }
    static public double getAverageRuns(String player){
        // YOUR CODE HERE
        String runs = data.get(player);
        runs=runs.substring(0,runs.length()-1);
        String[] dd = runs.split(",");
        int sum = 0;
        for(String ss : dd){
            sum=sum + Integer.valueOf(ss);
        }
        double avg = Double.valueOf(sum)/Double.valueOf(dd.length);
        System.out.println(avg);
        return avg;
    }
}
