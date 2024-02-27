import java.util.*;
class Fibbonaci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a=0;
		int b=1;
		int c;
		int n;

		System.out.println("Enter the rsnge of the series:-");
		n = sc.nextInt();

		for(int i=0; i<=n; i++)
		{
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;
			c = a;
		}
	}
}