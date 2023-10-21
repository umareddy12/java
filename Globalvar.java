//Code chef problem:Globalvariableds
public class Globalvar{
    static int globalVar = 10;  // Declaring a static global variable

    public static void main(String[] args) {
        System.out.println(globalVar); // Accessing the global variable (accessible here)
        myFunction();  // Accessing the global variable inside the function (accessible here)
    }

    // User-defined function
    public static void myFunction() {
        System.out.println(globalVar); // Accessing the global variable
    }
}
