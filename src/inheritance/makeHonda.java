package inheritance;

public class makeHonda extends Bike{ //inherits the properties of parent (Bike) class
public void tyreType()
{
	System.out.println("tyres good");
	
}

	
	//Method overriding --overridden
	public void startBike()
	{
		System.out.println("Honda start");
	}

}
