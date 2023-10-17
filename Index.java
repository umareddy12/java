//Codechef problem:Incorrect Index

import java.util.*;

class Index{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Input string
        scanner.close();

        if (s.length() > 1 && s.length() > 4 && s.length() > 6) {
            char c1 = s.charAt(0); // correct the indexing from one based to zero based
            char c2 = s.charAt(3);
            char c3 = s.charAt(5);

            System.out.println("" + c1 + c2 + c3);
        } else {
            System.out.println("Invalid indices"); // Handle the case when indices are out of bounds
        }
    }
}
