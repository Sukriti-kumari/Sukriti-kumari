package oopsConsept;

class Custmr{
	//constructor should have same name as class name.
	//Constructor is a setter which gets called during object creation and helps in initialization the object.
	//constructor do not have return type
	private int cid;
	private String cname;
	private long cnumber;
	public Custmr(int cid, String cname, long cnumber) {
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
class DefaultConstructor{
	//Default Constructor is a constructor which is automatically gets created in a class when not even a single constructor provided by programmer.
	private String name;
	private int age;
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;	
	}
}

class ParameterisedConstructor{

	private String name;
	private int age;
	private long number;
	ParameterisedConstructor(String name, int age, long number){
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;	
	}
	public long getNumber() {
		return number;
	}
}

class ConstructorOverloading{
	private String name;
	private int age;
	private long number;
	ConstructorOverloading(){
		name = "shkjs";
		age = 27;
		number = 32576356636L;
	}
	ConstructorOverloading(String name, int age, long number){
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;	
	}
	public long getNumber() {
		return number;
	}
}
class ConstructorChaining{
	//Constructor chaining to call another constructor in a constructor using this method in a class.
	//this() method call takes the control to from inside the constructor of a class to another constructor from the same class.
	private String name;
	private int age;
	private long number;
	ConstructorChaining(){
		name = "supriya";
	}
	ConstructorChaining(int age){
		this();
		name = "sanjana";
		age = 27;
		number = 32576356636L;
	}
	ConstructorChaining(String name, int age, long number){
		this(age);
	}
	
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;	
	}
	public long getNumber() {
		return number;
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		//Custmr cus = new Custmr(31, "Sukriti", 1223457686L);
		//System.out.println(cus.getCid()+ " "+ cus.getCname()+" "+ cus.getCnumber()); 
		//DefaultConstructor c = new DefaultConstructor();
		//System.out.println(c.getName()+ " "+ c.getAge());
		//ParameterisedConstructor pc = new ParameterisedConstructor("Sukriti", 30, 12356456767L);
		//System.out.println(pc.getName()+ " "+ pc.getAge()+" "+ pc.getNumber());
		//ConstructorOverloading co = new ConstructorOverloading();
		//ConstructorOverloading col = new ConstructorOverloading("sgfhjgd", 45, 325933720L);
		//System.out.println(co.getName()+" "+ co.getAge()+" "+ co.getNumber());
		//System.out.println(col.getName()+" "+ col.getAge()+" "+ col.getNumber());
		ConstructorChaining cc = new ConstructorChaining("Sukriti",33, 4357653238L );
		System.out.println(cc.getName()+" "+ cc.getAge()+" "+ cc.getNumber());
	}

}
