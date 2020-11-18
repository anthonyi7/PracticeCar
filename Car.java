
import java.util.Scanner;

public class Car
{
	static void run()
	{
		
		
		Scanner userInput = new Scanner(System.in);
		String part = "";
		
		
	
	}
}

interface Vehicle
{
	public void function();
		
}

class CarPart implements Vehicle
{
	static int condition = 100;
	
	void status()
	{
		System.out.println("The condition of this vehicle is: " + condition);
	}
	
	public void function() 
	{
		
	}
	
}

class Engine extends CarPart
{
	static String running = "Running";
	static int temp= 300;
	public void function()
	{
		System.out.println("The engine is " + running + " at " + temp + "degrees Fahrenheit");
	}
}

class fuelTank extends CarPart
{
	int capacity;
	int level;
}

class wheels extends CarPart
{
	int tread;
}

class windows extends CarPart
{
	boolean downOrUp;
}