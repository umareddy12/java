// Hacker Rank:Java If-Else
// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If_else{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        scanner.close();
        if(n % 2!=0)
        {
            System.out.println("Weird");
        }
        else{
         if(n >=2 && n <=5 )
        {
            System.out.println("Not Weird");
        }
        else if(n >=6 && n <=20)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
        }

        
    }
}
