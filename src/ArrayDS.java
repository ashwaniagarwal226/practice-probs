import java.util.Arrays;
import java.util.Set;

public class ArrayDS {

    public static void main(String... args) {

        System.out.println("ashwani");

        System.out.println(getCommonString("failpass","sailpass"));


    }


    private static String getCommonString(String strOne, String strTwo) {
        String finalString="";

        for(int i=0;i<=strOne.length()-1;i++){

            if(strTwo.indexOf(strOne.charAt(i)) !=-1){

                if(finalString.indexOf(strOne.charAt(i))==-1){
                    finalString = finalString + strOne.charAt(i);
                }

            }
        }

        return finalString;
    }


}

