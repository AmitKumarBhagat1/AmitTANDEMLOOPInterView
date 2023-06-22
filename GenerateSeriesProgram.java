package FirstTest;
import java.util.Scanner;
public class GenerateSeriesProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series number");
		int input=sc.nextInt();
	    generateSeries(input);

	}

	 public static void generateSeries(int x)
	 {
	        for (int i = 1; i <= x; i++) 
	        {
	           if(i==1)
	           {
	        	   System.out.print(i);
	           }
	           else
	           {
	        	   System.out.print(","+i);
	           }
	           
	            i++;
	        }
	 }
}
