
class Vehicle
{
	protected String brand="BMW";
	public void display()
	{
		System.out.println("welcome");
	}
}
class Car1 extends Vehicle
{
	protected String color="white";
	public static void main(String args[])
	{
		Car1 mycar=new Car1();
		mycar.display();
		System.out.println(mycar.brand+" "+mycar.color);
		
	}
}
