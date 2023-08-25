
import java.util.Scanner;
public class Grades1{
public static void main(String args[])
{
	//int marks=90;
	Scanner in=new Scanner(System.in);
	System.out.println("enter ur marks:");
	int marks=in.nextInt();// Read an integer input from the user
	
	
	
	if(marks>=95)
	{
		System.out.println("U got A grade");
	}
	else if(marks>=85)
	{
	   System.out.println("U got B grade");	
	}
	else if(marks>=75)
	{
		System.out.println("U got C grade");
	}
	else if(marks>=65)
	{
		System.out.println("U got D grade");
	}
	else if(marks>=55)
	{
		System.out.println("U got E grade");
	}
	else
	{
		System.out.println("FAIL");
	}
}
} 
