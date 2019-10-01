package TimBuchalka_Classes_Constructors_Inheritance;

public class Main {

	
	public static void main(String [] args){
		
	/*	Car porsche = new Car();//an individual object for the class car
		Car holden = new Car();
		porsche.setModel("Carrera");
		System.out.println("The car model is "+ porsche.getModel());
		//BankAccount johnsBkcnt = new BankAccount(200);
		BankAccount johnsBkcnt = new BankAccount();
		//johnsBkcnt.setBalance(200);
		
		johnsBkcnt.deposit(200);
		
		johnsBkcnt.withdrawl(250);
		johnsBkcnt.withdrawl(125);
		johnsBkcnt.withdrawl(125);
		johnsBkcnt.withdrawl(25);
		
		System.out.println(johnsBkcnt.getBalance()); */
		/*
		VipCustomer JohnVip = new VipCustomer("John");
		System.out.println("Vip customer name is "+ JohnVip.getName()+ " the email associated with this acount is "+ JohnVip.getEmail());
		System.out.println("The credit limit associated with this account is "+ JohnVip.getCreditLimit());
		System.out.println();
		
		VipCustomer DaveVip = new VipCustomer("Dave", 5.0);
		System.out.println("Vip customer name is "+ DaveVip.getName()+ " the email associated with this acount is "+ DaveVip.getEmail());
		System.out.println("The credit limit associated with this account is "+ DaveVip.getCreditLimit());
		System.out.println();
		
		VipCustomer CarlVip = new VipCustomer("Carl", 4.0, "Carl@gmail.com");
		System.out.println("Vip customer name is "+ CarlVip.getName()+ " the email associated with this acount is "+ CarlVip.getEmail());
		System.out.println("The credit limit associated with this account is "+ CarlVip.getCreditLimit());
		System.out.println();  */
		/*
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog Lobo = new Dog("Lobo", 5, 95, 2, 4, 1, 20, "short");
		
		System.out.println(Lobo.getName() + " weights " + Lobo.getWeight()+ " pounds.");
		System.out.println(Lobo.getName() + " is hungry...better feed him.");
		Lobo.eat();
		Lobo.move(7);
		
		Fish dobo = new Fish("Dobo", 1, 1, 2, 2, 3);
		System.out.println(dobo.getName() + " is eating");
		dobo.eat();
		dobo.move(12);  */
		/*
		Jeep Wrangler = new Jeep(3, "Wheel", 5, 3, 5, false);
		Wrangler.displaySpeed();
		Wrangler.increaseSpeed();
		Wrangler.displaySpeed();
		Wrangler.decreaseSpeed();
		Wrangler.displaySpeed();
		Wrangler.decreaseSpeed();
		Wrangler.displaySpeed();
		Wrangler.decreaseSpeed();
		Wrangler.displaySpeed();
		Wrangler.decreaseSpeed();
		Wrangler.displaySpeed();
		Wrangler.decreaseSpeed();
		Wrangler.displaySpeed(); 
		System.out.println(Wrangler.isHardTop());  */
		/*
		door aDoor = new door("wood", false);
		furniture lamp = new furniture("lamp");
		electricSockets power = new electricSockets(2, false);
		windows aWindow = new windows("clear glass", true, false);
		power.flipSwitch();
		System.out.println(aDoor.isLocked());*/
		Printer printer = new Printer(60, true);
		System.out.println(printer.getTonerLevel());
		System.out.println(printer.filltoner(15));
		printer.printedPages(5);
		System.out.println(printer.numPagesPrinted());
	}//end main
	
	
}//end class
