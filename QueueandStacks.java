import java.io.*;
import java.util.*;

public class Solution {
    static char c[]=new char[10];
    static Stack<Character> stack=new Stack<Character>();
    public static void pushCharacter(char c)
    {
        stack.push(c);
    }
    static Queue<Character> queue=new LinkedList<Character>();
    public static void enqueueCharacter(char c)
    {
        queue.add(c);
    }
    public static char popCharacter()
    {
        return stack.pop();
    }
    public static char dequeueCharacter()
    {
        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
