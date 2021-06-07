package EBook;

import java.util.Scanner; //predefined class

public abstract class EBookEnterprise{//abstraction
	
	Scanner s = new Scanner(System.in);

	protected String name, address, phone, email;
	
	public  EBookEnterprise(String n, String a, String p, String e) { //constructor with 4 arguments
		
		this.name = n;
		this.address = a;
        this.phone = p;
        this.email = e;
	}

	public void setName(String n) {
		this.name=n;
	}
	
	public void setAddress(String a) {
		this.address=a;
	}

	public void setPhone(String p) {
		this.phone=p;
	}
	
	public void setEmail(String e) {
		this.email=e;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String tostring() {
		return name + address + phone + email;
	}
}
