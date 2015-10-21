
public class constructors {
	String name;
	int no;
	int age;
	
	public constructors()
	{
		System.out.println("Constructor called");
		
	}
	public constructors(String name, int no, int age)
	{
		this.name=name;//refers to global variable name
		this.age=age;
		this.no=no;
	}
	

	public static void main(String[] args) {
	constructors s1=new constructors();
	s1.name="Neha";
	s1.no=100;
	s1.age=5;
	
	constructors s2=new constructors();
	s2.name="Reddy";
	s2.no=200;
	s2.age=6;                ;

    constructors s3=new constructors("Sudaraguntla", 333, 7);
    System.out.println(s3.name);
    System.out.println(s3.no);
    System.out.println(s3.age);
	}

}
