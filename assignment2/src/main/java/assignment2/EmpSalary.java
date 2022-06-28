package assignment2;

import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {
		PartTimeSalary parttimeSalary = new PartTimeSalary(22088, 30000, 10000, 5000, "Aviansh", "Jaya", "Hyderabad",
				"500008");
		FullTimeSalary fulltimeSalary = new FullTimeSalary(22088, 30000, 10000, 5000, "Aviansh", "Jaya", "Hyderabad",
				"500008");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true){
		System.out.println("--------------------------------------");
		System.out.println("|      Ojas Innovative Technoligies     |");
		System.out.println("--------------------------------------");
		System.out.println("|  1. Part Time Job            |");
		System.out.println("|  2. Full Time Job                |");
		System.out.println("|  3. Exit                          |");
		System.out.println("--------------------------------------");
		System.out.println("Enter Your choice ?");
		int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Employee Id  " + parttimeSalary.EmpId);
				System.out.println("Employee Name :" + parttimeSalary.getRealname());
				System.out.println("Employee Basic " + parttimeSalary.Basic);
				System.out.println("Employee Allowance " + parttimeSalary.Allowance);
				System.out.println("Employee Address " + parttimeSalary.Address);
				System.out.println("Employee Pincode " + parttimeSalary.Pincode);
				parttimeSalary.CalcSalary();
				break;
			case 2:
				System.out.println("Employee Id  " + fulltimeSalary.EmpId);
				System.out.println("Employee Name :" + fulltimeSalary.getRealname());
				System.out.println("Employee Basic " + fulltimeSalary.Basic);
				System.out.println("Employee Allowance " + fulltimeSalary.Allowance);
				System.out.println("Deduction amount " + fulltimeSalary.Deductions);
				System.out.println("Employee Address " + fulltimeSalary.Address);
				System.out.println("Employee Pincode " + fulltimeSalary.Pincode);
				fulltimeSalary.CalcSalary();
			
				break;
			case 3:
				System.out.println("Kindly select the choise in given range 1/2 only");
				break;
			}
	
		}
	}
}
