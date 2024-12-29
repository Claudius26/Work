public class MaximumAndMinimum{

	public static void main(String... args){

	int[] arr = {3, 5, 4, 1, 9};

	int maximum = arr[0];

	int minimum = arr[0];

	for(int count: arr){

	if(count > maximum){

	maximum = count;

	}

	if(count < minimum){

	minimum = count;

	}


	}
	System.out.printf("%s%d  %s%d ", "Maximum is: ", maximum,"minimum is:",minimum);
}

}