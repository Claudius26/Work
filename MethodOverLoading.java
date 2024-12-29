import java.util.Scanner;

public class MethodOverLoading
{

	public static int square(int number)
	{

	return number * number;


	}
	public double square(double number)
	{

	return number * number;


	}


	public static void main(String... args)
	{
	Scanner scan = new Scanner(System.in);

	System.out.print("enter number: ");
	double val = scan.nextDouble();

        MethodOverLoading value = new  MethodOverLoading();

	if(val == val)
	{
	System.out.print(square((int)val));

	}

	else 
	{

	System.out.print(value.square(val));

	}

	}




}