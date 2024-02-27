import java.util.*;
class Conditionals
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;

		System.out.println("Enter the age of Candidate:-");
		age = sc.nextInt();

		if(age >= 18)
		{
			System.out.println("Candidate is eligible for Voting!!!!");
		}
		else
		{
			System.out.println("Candidate is Not-eligible for Voting!!!!");
		}
	}
}