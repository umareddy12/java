// Codechef problem:Roller Coaster
class Roller
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int x=sc.nextInt();
		    int h=sc.nextInt();
		    if(x>=h){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    t--;
		}
	}
}
