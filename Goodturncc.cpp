//codechef:problem Good turn
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Goodturncc

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		int X=s.nextInt();
		int Y=s.nextInt();
		
		int sum=X+Y;
		if(sum>6)
		{
		    System.out.println("YES");
		}
		else{
		     System.out.println("NO");
		}
		}
	}
}
