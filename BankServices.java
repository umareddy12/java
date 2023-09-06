//create a class BankServices 
//create member variables for userid,accbal,usernumber;
//create a method to displaydetail
//create a main method BankServices_main
//create a object of BankServices
//assign values to member variables of class by using getters & setters and call the method to displaydetails
class BankServices {
    private int userId;
    private int accBal;
    private int userAcNo;

    public void displayDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Account Balance: " + accBal);
        System.out.println("Account Number: " + userAcNo);
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public int getAccBal() {
        return accBal;
    }

    public int getUserAcNo() {
        return userAcNo;
    }

    // Setter methods
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public void setUserAcNo(int userAcNo) {
        this.userAcNo = userAcNo;
    }

    public static void main(String[] args) {
        BankServices myObj = new BankServices();
        
        // Assign values to member variables using setter methods
        myObj.setUserId(111);
        myObj.setAccBal(5000);
        myObj.setUserAcNo(987654321);
        
        // Call the displayDetails method to show the information
        myObj.displayDetails();
    }
}

