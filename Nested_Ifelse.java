import java.util.*;
class Nested_Ifelse
{
	public static void main(String args[])
	{
		int num1 =10;
		int num2 =20;
		int num3 =30;

		if(num1 < num2)
		{
			if(num2 < num3 )
			{
				System.out.println("num3 is biggest");
			}
			else
			{
				System.out.println("num2 is biggest");
			}
		}
		else
		{
			if(num1 > num3)
			{
				System.out.println("num1 is biggest");
			}
		}
	}
}