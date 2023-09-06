public class RoadToll {
    
    int count;

    void display() {
        if (count == 2) {
            System.out.println("Amount is 0");
        } else if (count == 4) {
            System.out.println("Amount is 10");
        } else if (count > 4) {
            System.out.println("Amount is 20");
        }
    }

    public static void main(String[] args) {
        RoadToll toll = new RoadToll();
        toll.count = 4; 
        toll.display();
    }
}

