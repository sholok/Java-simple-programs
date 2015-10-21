package first;

public class tables {

	public static void main(String[] args) {
		int x;
		System.out.println("2 table " );
      
        for(int y=1;y<=10;y++)
        {	
		for(int i=1;i<=10;i++)
		{   x=y*i;
		 System.out.println(y+ "*" +i +"=" +x);
		}
		if (y==4)
		{
			break;
			
		}
        }
	}

}
