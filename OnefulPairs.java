//codechef:Oneful Pairs
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OnefulPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
    Scanner s=new Scanner(System.in);
   
    int a=s.nextInt();
    int b=s.nextInt();
    int x=a+b+(a*b);
    if(x==111)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}
	

