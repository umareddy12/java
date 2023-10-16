// Hacker Rank proble:Java Output Formatting
import java.util.Scanner;

public class OpFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                //System.out.println(s1+"\t\t\t "+x);
                 System.out.println(String.format("%-15s%03d", s1, x));
            }
            System.out.println("================================");

    }
}



