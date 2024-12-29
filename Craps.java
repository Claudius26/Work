import java.security.SecureRandom;

public class Craps
{

private static final SecureRandom randomValues = new SecureRandom();

private enum Status {CONTINUE, WON, LOST};

private static final int SNAKES_EYES = 2;
private static final int TREY = 3;
private static final int SEVEN = 7;
private static final int YO_LEVEN = 11;
private static final int BOX_CARS = 12;

public static void main(String args[])                                                                  
{
	int myPoint = 0;
	Status gameStatus;

	int sumOfDice = rollDice();

	switch(sumOfDice)
	{

	case SEVEN:

	case YO_LEVEN:

		gameStatus = Status.WON;

		break;

	case SNAKES_EYES:

	case TREY:

	case BOX_CARS:

		gameStatus = Status.LOST;

		break;

	default:
		gameStatus = Status.CONTINUE;

		myPoint = sumOfDice;

		System.out.printf("point is %d%n", myPoint);

		break;
	}

	while(gameStatus == Status.CONTINUE)
	{
		sumOfDice = rollDice();

		if (sumOfDice == myPoint)

		{

			gameStatus = Status.WON;

		}

		else
		{

			if(sumOfDice == SEVEN)
			{

				gameStatus = Status.LOST;
			}		

		}

	}

	if(gameStatus == Status.WON)
	{

		System.out.println("Player wins");

	}

	else
	{

		System.out.println("Player lost");

	}


}

public static int rollDice()
{

	int die1 = 1 + randomValues.nextInt(6);
	int die2 = 1 + randomValues.nextInt(6);

	int sumOfDie = die1 + die2;

	System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sumOfDie);

	return sumOfDie;

}



}