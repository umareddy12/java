# cook your dish here
import java.util.Scanner;
class Marks1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>=2*Y)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
