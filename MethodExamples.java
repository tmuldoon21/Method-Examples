import java.util.Scanner;

public class MethodExamples 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String name = user.nextLine();
		
		greeting(name);
		
		System.out.print("Enter a number to double: ");
		int myNum = user.nextInt();
		user.nextLine();
		
		int myDouble = doubleInt(myNum);
		System.out.println("My number doubled: " + myDouble);
		
	}
	
	public static void greeting(String arg1)
	{	//arg1 = name;
		System.out.println("hello, " + arg1);
		System.out.println("I hope you have a nice day.");
	}
	
	
	public static int doubleInt(int num)
	{
		int newNum = num * 2;
		return newNum;
	}
	
	
}
