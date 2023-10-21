//codechef problem:Parameters, Arguments
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Parameters
{
	public static void main (String[] args) throws java.lang.Exception
	{
        String name = "Alice";
        greet(name);
    }

    // User-defined method to greet a person by name
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
	}
}
