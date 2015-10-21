package inheritance;

public class testBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.color="red";
		b.startBike();
		makeHonda m=new makeHonda();
		m.color="pink";
		//m.startBike();
	    m.tyreType();
	    m.startBike();
	    Bike b1=new makeHonda();
	    b1.startBike();//over ridden method called from parent class
	    b1.stopBike();
	   

	}
	

}
