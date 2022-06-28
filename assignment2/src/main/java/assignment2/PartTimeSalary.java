package assignment2;

public class PartTimeSalary extends Employee {

	public PartTimeSalary(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		
	}
	public void CalcSalary(){
		Sal= (Basic/2) + Allowance;
		System.out.println("Employee salary is : "+Sal);
	}

}
