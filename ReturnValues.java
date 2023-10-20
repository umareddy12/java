// codechef problem:Return values

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ReturnValues
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);

        int t = 3; // Number of test cases

        for (int i = 0; i < t; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            computeValue(X,Y);
        }

        scanner.close();
    }

    // User-defined method to compute and print values
    public static void computeValue(int A, int B) {
        //complete the function
     int a=A*A+2*A*B+B*B;
     int b=A+B;
     System.out.println(a);
     System.out.println(b);
	}
}
