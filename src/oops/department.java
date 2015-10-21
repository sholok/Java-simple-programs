package oops;

public class department {
	//non static global variables
	public String deptname;
    public int deptid;
    public int empno;
    
    //global static variable
    public static String comp_name;
    
    //non static functions
    public void add_dept()
    {
    	
    System.out.println("Departmnet added");
    }
    public void change_dept()
    {
    	System.out.println("Department changed");
    	
    }
    
    //static method
    public static void holidays()
    {
    	System.out.println("Holidays are");
    }
    

}
