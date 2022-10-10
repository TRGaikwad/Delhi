package Java;

public class StaticA3 {
	public static void A1()
	{
		System.out.println("This is A1 static method");
	}
  public static void main(String[] args) {
		System.out.println("This is main method");
		A1();
		A2();
	}
	public static void A2()
	{
	   System.out.println("This is A2 static method");
	}
}
