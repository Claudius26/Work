public class Intersection{

	public static void main(String... args){

	int[] a = {1, 2, 3,};

	int[] b = {4, 5, 6};

	int[] union = new int[a.length + b.length];

	int unionIndex = 0;

	for(int i = 0; i < a.length;i++){

		int count = 0;

		for(int j = 0;j < unionIndex;j++){

		if(a[i] == union[j]){
		count++;		
		}
	}

		if(count == 0){

		union[unionIndex] = a[i];
		unionIndex++;

		}
	
	}
	

	for(int i = 0; i < b.length;i++){

		int count = 0;

		for(int j = 0;j < unionIndex;j++){

		if(b[i] == union[j]){
		count++;		
		}
	}

		if(count == 0){

		union[unionIndex] = b[i];
		unionIndex++;

		}
	
	}
	
		for(int i = 0; i < unionIndex; i++){

		System.out.print(union[i]);

		}
	
	}

}