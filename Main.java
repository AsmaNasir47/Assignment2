package EBook;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println();

		Employees e = new Employees("Technician", "Othman", 12345, 3500);
		e.getName();
		e.getPosition();
		e.getID();
		e.getSalary();
		System.out.println(e.tostring());
		
		Customers c = new Customers("Alisa", "12 Jalan Itik", "0123456789", "Alisa@gmail.com", "The Missing Gun", "Action", null);
		c.getPrice();
		c.getQuantity();
		c.getTotPrice();
		System.out.println();
		System.out.println(c.toString());
		
		Financial f = new Financial("Technician", "Othman", 12345, 3500);
		System.out.println(f.toString());
		
		Book b = new Book("Alisa", "12 Jalan Itik", "0123456789", "Alisa@gmail.com", "The Missing Gun", "Action", null);
		b.BookDetails();
		System.out.println(b.toString());
	
	}

}