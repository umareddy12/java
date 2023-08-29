//String Operators 
public class StringOperators{
	public static void main(String args[])
	{
		String str1="Welcome to java course";
		String str2=" java language";
		String str3=" learning java";
		String str4=" java language";
		String s1="    hlo everyone     ";
		String x="ABCD";

		String s="Welcome to java course"+" learning java";
		System.out.println(s);//Welcome to java course learning java
		System.out.println(str1.concat(str2));//Welcome to java course java language
		System.out.println(str1.equals(str2));//false
		System.out.println(str2.equals(str4));//true
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str4));//0
		System.out.println(str1.substring(0,2));//returns we as a stustring
		System.out.println(str1.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(str1.startsWith("We"));//true
		System.out.println(str3.endsWith("va"));//true 
		System.out.println(str2.endsWith("java"));//False       
		System.out.println(str2.length());
                                                             System.out.println(str1.indexOf("java"));
		
		
		
	}
}
