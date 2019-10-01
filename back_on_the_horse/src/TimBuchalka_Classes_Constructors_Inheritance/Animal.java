package TimBuchalka_Classes_Constructors_Inheritance;

public class Animal {

	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	
	public Animal(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}//end constructor

	public void eat(){
		System.out.println("chomp chomp chomp");
	}//end method
	
	public void move(int speed){
		
		if(speed > 5)
			System.out.println(name + " is moving fast");
		else
			System.out.println(name+ " is moving slow");
		
	}//end method
	public String getName() {
		return name;
	}


	public int getBrain() {
		return brain;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}

	
	
	
	
	
	
	
	
}//end class


