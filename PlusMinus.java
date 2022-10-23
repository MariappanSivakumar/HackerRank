import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    static int minus = 0, plus = 0, zero = 0;
    public static void plusMinus(List<Integer> arr) {
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==0)
            {
                zero++;
            }else if(arr.get(i)>0) 
            {
                plus++;
            }else
            {
                minus++;
            }
            
        }
        int size = arr.size();
        System.out.println(String.format("%.6f",(double)plus/size));
        System.out.println(String.format("%.6f",(double)minus/size));
        System.out.println(String.format("%.6f",(double)zero/size));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
