public class Employee5 {
    String empname;
    int empid;
    double salary;

    public void display() {
        double empbonus = salary * 0.2;
        System.out.println("empbonus: " + empbonus);
    }

    public static void main(String args[]) {
        Employee5 emp1 = new Employee5();
        emp1.empname = "uma";
        emp1.empid = 22;
        emp1.salary = 1000;
        emp1.display();
    }
}

