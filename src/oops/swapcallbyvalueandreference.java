package oops;

public class swapcallbyvalueandreference {
	int x;
	int y;
	
	public static void swap(swapcallbyvalueandreference s)
	{
		int c;
		c=s.x;
		s.x=s.y;
		s.y=c;
	
		
		//System.out.println(a);
		//System.out.println(b);
		
		
	}

	public static void main(String[] args) {
		swapcallbyvalueandreference scr=new swapcallbyvalueandreference();
		scr.x=10;
		scr.y=20;
		int m;
		int n;
		//swap(scr.x,scr.y);
		swap(scr);
		System.out.println(scr.x);
		System.out.println(scr.y);

	}

}
