//Codechef problem:Square of numbers
import java.util.Scanner;

public class Square {
    // User-defined function to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int result1 = square(num1); // Call the square function
        int result2 = square(num2); // Call the square function again

        System.out.println("Square of " + num1 + " is " + result1);
        System.out.println("Square of " + num2 + " is " + result2);

        scanner. Close();
    }
}
