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
     Sample Input 
     4
        3 2 1 3
    Sample Output 
        2
     */
    public static void minimax(long num[])
    {
        long big=num[0],small=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(big<num[i])
                big=num[i];
            if(num[i]<small)
                small=num[i];
        }
        System.out.println(small+" "+big);
    }
    public static void miniMaxSum(List<Integer> arr) {
        long nums[]=new long[arr.size()];
        int count=0;
        while(count!=(arr.size()))
        {
            int zip=0;
            for(int i:arr)
            {
                if(zip!=count)
                    nums[count]+=i;
                zip++;    
            }
            count++;       
        }
        minimax(nums);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
