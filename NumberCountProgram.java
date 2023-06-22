package FirstTest;

public class NumberCountProgram 
{
	public static void main(String[] args) 
	{
		int []mul= {1,2,3,4,5,6,7,8,9};
		int []inp= {1,2,8,9,12,46,76,82,15,20,30};
		for(int i=0;i<mul.length;i++)
		{
			int count=0;
			for(int j=0;j<inp.length;j++)
			{
				if(inp[j]%mul[i]==0)
				{
					count++;
				}
			}
			System.out.print(mul[i]+":"+count+",");
		}
	}
}
