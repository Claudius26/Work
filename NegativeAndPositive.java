public class java {

	
	public static void main(String... args){

	int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

	int[] result = new int[arr.length];

	int negative = 0;

	for(int value = 0; value < arr.length; value++){

	if(arr[value] < 0) {
	result[negative] = arr[value];
	negative++;
	}


	}

	int positive = negative;

	for(int value = 0; value < arr.length; value++){

	if(arr[value] > 0) {
	result[positive] = arr[value];
	positive++;
	
	}
	}

	for(int i : result){

	System.out.print(i + " ");

	}

}

}

