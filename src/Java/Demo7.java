package Java;

public class Demo7 {
	public static void a()
	{
		System.out.println("This is static a method");
	}
	public static void b()
	{
		System.out.println("This is static b method");
	}
	public void c()
	{
		System.out.println("This is non static c method");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		a();
		b();
		Demo7 d=new Demo7();
		d.c();
		d();

	}
	public static void d()
	{
		System.out.println("This is static d method");
	}
	

}
