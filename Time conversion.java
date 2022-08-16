import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) {
       String time=new String();
       for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='A'||s.charAt(i)=='P')break;
            else
            {
              if(i>1)
                time+=String.valueOf(s.charAt(i));  
            } 
        int n=Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        if(n==12&&s.indexOf("AM")>0)
            time="00"+time; 
        else if(s.indexOf("PM")>0&&n!=12)
        {
            n+=12;
            time=n+time; 
        }
        else 
        {
            if(n<10)
                time="0"+n+time;
            else 
                time=n+time;  
        }
        System.out.println(n);
        return time;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
