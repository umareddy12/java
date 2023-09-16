//filename:Construtor1.java
public class Construtor1 {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Construtor1 myCar = new Construtor1(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
