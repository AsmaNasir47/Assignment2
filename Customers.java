package EBook;

import java.util.Scanner;//predefined class

public class Customers extends Book implements Payment{//inheritance
	
	Scanner s = new Scanner(System.in);
	
	protected String name, address, tittle, book, phoneNumber;
	protected int quantity;
	protected double price;
	
	public Customers(String n, String a, String p, String e, String t, String th, String b){//inherit from superclass
		super(n, a, p, e, b, b, b);
		this.tittle = t;
		this.theme = th;
		this.book = b;
	}

	public void customersDetails() {
		
		System.out.println("**********Customer's Detail***********");
		
		System.out.println("Name : ");
		name = s.nextLine();
		
		System.out.println("Address: ");
		address = s.nextLine();
		
		System.out.println("Phone number: ");
		phoneNumber= s.nextLine();
		
		return;
	}
	
	public void BookDetails() {
		
		System.out.println("Book's Name: ");
		this.name = s.nextLine();
		
		System.out.println("Book's Tittle: ");
		this.name = s.nextLine();
		
		System.out.println("enter quantity:");
		this.quantity = s.nextInt();
		
		System.out.println("enter price:");
		this.price = s.nextDouble();
	}

	//Encapsulation setter getter
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getTotPrice() {//method to calculate total price of the books
		return this.price * this.quantity;
	}
	
	public double getPayment() {//interface 
		return 0;
	}
	void CustomerDetail(String name, String address, String phoneNumber){ //constructor with 3 argument
		System.out.println("***************Customer's Detail*************");
		System.out.println("Name         : " + name);
		System.out.println("Address      : " + address);
		System.out.println("Phone Number : " + phoneNumber);	
	}
	
	void calcPrice(int q, double p) { //constructor with 2 argument
		this.quantity = q;
		this.price = p;
		double tp = q*p;
		System.out.println("Total Price : RM " + tp);
	}
	
	public String tostring() {//Polymorphism method to print info
		
		 return "\n****************Customer's Detail*******************" +
				"\nName     : " + this.name +
				"\nAddress : " + this.address +
				"\nPhone Number     : " + this.phoneNumber + 
				"\nTotal Price  : " + this.getTotPrice();
			}//end of tostring

}//end of class
