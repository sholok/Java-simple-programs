package oops;

public class company {

	public static void main(String[] args) {
		department d=new department();
		
		department.comp_name="CTS";
		
		department.holidays();
		d.deptid=10;
		d.deptname="software";
		d.empno=100;
		
		d.add_dept();
        d.change_dept();
        System.out.println("department id is" +d.deptid);
        System.out.println(d.deptname);
        System.out.println(d.empno);
        		
	}

}
