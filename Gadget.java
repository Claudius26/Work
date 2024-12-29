public class Gadget{

	
	static String name;

	static int price;

	static String brand;

	public static void show(Gadget object){

	System.out.println("Name:" + name + "\nprice:" + price + "\nbrand:" + brand);


	}


	public static void main(String... args){

	Gadget object = new Gadget();

	name = "Smart phones";

	brand = "Apple";

	Gadget object2 = new Gadget();

	//brand = "Samsung";

	price = 3000;
	
	show(object);
	//show(object2);



	}




}