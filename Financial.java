package EBook;

import java.util.Scanner; //predefined class

public class Financial extends Employees implements Payment{//inheritance
	
	Scanner s = new Scanner (System.in);
		
	String name;
	private double salary, sales, income, expenses, profit, payment;
	private char choice;
	//inherit
	public Financial(String p, String n, int id, double s) {
		super(p, n, id, s);
	}
	
	public void calPayment() {  // 1.4 constructor with zero arguments
		do {
		payment++;
	    System.out.print("Enter customer's name    : ");
	    name = s.nextLine();
	    System.out.print("Enter customer's payment : ");
	    payment = s.nextDouble(); 
	   
		System.out.print("\nAdd another details? (Y or N): ");
	    choice = s.next().charAt(0);

	} while (choice == 'Y' || choice == 'y');  }

		public void Expenses()  {   // method to calculate expenses
			System.out.print("Enter the total expenses : ");
			expenses = s.nextDouble();
		}
		public void Income()  {   // method to calculate income
			System.out.print("Enter the total income : ");
			expenses = s.nextDouble();
		}
		
		public void Salary()  {  // method to calculate salary
			System.out.print("Enter the total salary : ");
			salary = s.nextDouble();
		}
		
		public void Sales() {   // method to calculate profit
			profit = payment-(expenses+salary);
		}
		
		public double getPayment() {//interface
			return 0;
		}
		
		public String tostring() {//Polymorphism method to print info
			
			 return "\n***********************************" +
					"\nName                : " + this.name +
					"\nEmployee's Name     : " + super.getName() +
					"\nSalary of Employees : " + this.salary +
					"\nSales of books      : " + this.sales + 
					"\nTotal Income        : " + this.income +
			        "\nTotal Expenses      : " + this.expenses +
			        "\nTotal Profit        : " + this.profit +
			        "\nTotal Payment       : " + this.payment;
				}//end of tostring
}
