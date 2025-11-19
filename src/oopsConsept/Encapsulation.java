package oopsConsept;
//Encapsulation prevents direct access and gives controlled access.
//We can achieve encapsulation by making private and providing getters and providing getters and setters

public class Encapsulation {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setData(100000);
		System.out.println(ba.getData());
		
		Customer cus = new Customer();
		cus.setData(33, "Sukriti", 7993983215L);
		System.out.println(cus.getCid()+" "+ cus.getCname() + " " + cus.getCnumber());

	}
}
//Shadowing problem: If local and Instance variable is with same name and user try to assign local variable to instance variable.
//We can overcome shadowing problem by using 'this' keyword for instance variable.
class Customer{
	private int cid;
	private String cname;
	private long cnumber;
	
	public void setData(int cid, String cname, long cnumber) {
		this.cid = cid;
		this.cname = cname;
		this.cnumber = cnumber;
	}
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public long getCnumber() {
		return cnumber;
	}
}

class BankAccount{
	private long balance;
	public void setData(long amt) {
		if(amt>=0) {
		balance = amt;
		}
		else {
			System.out.println("Invalid Amount");
			System.exit(0);
		}
	}
	public long getData() {
		return balance;
	}
}
