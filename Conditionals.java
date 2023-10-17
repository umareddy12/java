//Code chef problem:
import java.util.*;
import java.lang.*;
import java.io.*;
class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n > 5) {             // correct the incorrect if codition 
            System.out.println("the number is greater than 5");
        } else {
            System.out.println("the number is smaller than or equal to 5");
        }
        
        scanner.close();
    }
}
