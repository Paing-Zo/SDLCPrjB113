package Inherritance;

public class Abstract_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("Aung Min Khant","Bankauk",23,0);
		Employee e = new Salary ("Lee Fu Min","Thaw Thar",34,0);
		System.out.println("Computing salary using salary reference" +s.commputePay());
		System.out.println("Computing employee using salary reference" +s.commputePay());
	
	}

}
