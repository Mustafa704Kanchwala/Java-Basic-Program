import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:-");
		num = sc.nextInt();

		if(num % 2 == 0)
		{
			System.out.println(num +" is a Even number");
		}
		else
		{
			System.out.println(num +" is Odd number");
		}
	}
}