import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {


    public static void main(String... args){
        String s = "10:22:12PM";
        //Format of the date defined in the input String
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
            //Converting the input String to Date
            date= df.parse(s);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
            System.out.println(output);
        }catch(ParseException pe){
            pe.printStackTrace();
        }


    }
}
