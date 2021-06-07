package EBook;

import java.util.Scanner;

public class Employees {
	
	Scanner s  = new Scanner(System.in);
	
		private String position, name;
		private int ID;
		private double salary;
		
		public void EmployeesDetails() {
			
			System.out.println("***********Employees' Details***********");
			
			System.out.println("enter your position : ");
			this.position = s.nextLine();
			
			System.out.println("enter your name : ");
			this.name = s.nextLine();
			
			System.out.println("enter your ID : ");
			this.ID = s.nextInt();
			
			System.out.println("enter your salary : ");
			this.salary = s.nextDouble();
			
		 return;
		}
		
		public Employees(String n) {  // Constructor with 1 argument
			 this.name = n;
				System.out.println("Name : " + n);			
			}
		 
		 public Employees(int id, double s) {  // Constructor with 2 arguments
			 this.ID = id;
			 this.salary = s;
			 	System.out.println("ID : " + id);
			 	System.out.println("Salary : " + s);
		 }
		 
		 public Employees(String p, String n, int id, double s) {
			 position = p;
			 name = n;
			 ID = id;
			 salary = s;
		 }
		//encapsulation using setter getter
		public String getPosition() {
			return this.position;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return this.ID;
		}
		
		public double getSalary() {
			return this.salary;
		}
		
		public String tostring() {//Polymorphism method to print info
			
	 return "\n****************Employee's Detail*******************" +
 	        "\nPosition : " + this.position +
			"\nName     : " + this.name +
			"\nID       : " + this.ID + 
			"\nSalary   : " + this.salary;
		}//end of tostring
}//end of class