public class Mode{

	public static void main(String... args){

	int[] a = {1, 2, 3, 6, 3, 6, 1};

	int[] mode = new int[a.length];

	int index = 0;

	for(int i = 0; i < a.length;i++){

		int count = 0;

		for(int j = 0; j < a.length;j++){

		if(a[i] == a[j]){

		count++;		

		}
		
		}

		int occur = 0;
		for(int k = 0; k < index; k++){

		if(mode[k] == a[i]){

		occur++;

		}

		}

		if(count > 1 && occur == 0){

		mode[index] = a[i];

		index++;

		}

	}

		for(int i = 0; i < index; i++){

		System.out.print(mode[i] + " ");

		}
	}


}