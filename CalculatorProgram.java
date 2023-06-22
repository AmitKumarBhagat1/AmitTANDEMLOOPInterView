package FirstTest;
import java.util.Scanner;
public class CalculatorProgram 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		double a=sc.nextDouble();
		System.out.println("Enter the Second Number");
		double b=sc.nextDouble();
		System.out.println("Given Operations......\n (1)addition  (2)subtraction   (3)multiplication  (4)division");
		System.out.println("Enter your prefered Operation`");
		String operation=sc.next();

		double result;
		switch (operation)
		{
		case "addition":
			result = add(a, b);
			System.out.println("Result of addition: " + result);
			break;
		case "subtraction":
			result =sub(a, b);
			System.out.println("Result of subtraction: " + result);
			break;
		case "multiplication":
			result = multi(a, b);
			System.out.println("Result of multiplication: " + result);
			break;
		case "division":
			try 
			{
				result = divide(a, b);
				System.out.println("Result of division: " + result);
			}
			catch (ArithmeticException e) 
			{
				System.out.println("Error: " + e.getMessage());
			}
			break;
		default:
			System.out.println("Invalid operation.");
		}


	}
	public static double add(double a,double b)
	{
		return a+b;

	}
	public static double sub(double a,double b)
	{
		return a-b;

	}
	public static double multi(double a,double b)
	{
		return a*b;
	}
	public static double divide(double a, double b) 
	{
		if (b != 0) {
			return a / b;
		} 
		else {
			throw new ArithmeticException("Cannot divide by zero!");
		}
	}

}
