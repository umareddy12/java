
//Codechef problem:User defined function
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DefinedFuncn
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
            //write main function here
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            
           listGenerator(A);
           listGenerator(B);
          scanner. close();
    }

    // User-defined function to generate and print a list of numbers from 1 to limit
    public static void listGenerator(int limit) {
          //write the user defined function code here
          for(int i=1;i<=limit;i++)
          {
              System.out.print(i+" ");
          }
System.out.println();
	}
}

