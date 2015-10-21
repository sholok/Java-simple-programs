package oops;

public class TestBank {

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.name="icici";
		b1.balance=10000;
		b1.intrestgained(500);
		System.out.println(b1.balance);
		
		//create an object of members class
		Members m=new Members();
		m.add="s finley road, lombard";
		m.name="Neha";
		//assign object of member class to bank class variable
        b1.mem=m;
        System.out.println(b1.mem.add);
      // System.out.println(b1.name);
        System.out.println(b1.mem.name);
        
        
        Bank b2=new Bank();
        b2.mem=new Members();
        b2.mem.add="fairway Drive, naperville";
        b2.mem.name="Reddy";
     		 System.out.println(b2.mem.add);
        // System.out.println(b1.name);
          System.out.println(b2.mem.name);  			
        b2.getBalance();
        Members m2=b2.getBalance();
        m2.deposit();
        m2.withdrawl();
		
	}

}
