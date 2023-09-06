class BankAcc {
    private int accnumber;
    private String accname;
    private double accbal;

    public BankAcc(int accnumber, String accname, double accbal) {
        this.accnumber = accnumber;
        this.accname = accname;
        this.accbal = accbal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accbal = accbal + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Cannot deposit: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= accbal) {
            accbal = accbal - amount;
            System.out.println("Successful withdrawal");
        } else {
            System.out.println("Cannot withdraw: " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Your current balance is: " + accbal);
    }

    public static void main(String args[]) {
        BankAcc myobj = new BankAcc(1111, "uma", 1000000);
        myobj.displayBalance();
        myobj.deposit(5000);
        myobj.displayBalance();
        myobj.withdraw(1000);
        myobj.displayBalance();
    }
}

