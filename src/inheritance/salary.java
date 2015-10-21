package inheritance;

public class salary implements employees{

	public static void main(String[] args) {
		employees e=new salary();
		e.hike();
		e.hrpolicy();
	}

	@Override
	public void hike() {
		System.out.println("hike");
		
	}

	@Override
	public void hrpolicy() {
		System.out.println("hr");
		
	}

}
