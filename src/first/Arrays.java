package first;

public class Arrays {

	public static void main(String[] args) {
	int r=2;
	int c=2;
	int table[][]=new int[r][c];
	table[0][0]=10;
	table[0][1]=11;
	table[1][0]=12;
	table[1][1]=13;
	System.out.println(table.length);
	System.out.println(table[0].length);
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print("   "+table[i][j]);
        
		}	
		System.out.println(" ");
	
	}

}
}