class Else_If_Ladder
{
	public static void main(String args[])
	{
		char gender = 'm';

		if(gender == 'm')
		{
			System.out.println("The person is male");		//OUTPUT:- The person is male//
		}
		else if(gender == 'f')
		{
			System.out.println("The person is Female");
		}
		else if(gender == 'o')
		{
			System.out.println("Rather not to Say the gender");
		}
		else
		{
			System.out.println("Invalid Input!!!!");
		}
	}
}