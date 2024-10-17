package day04;

import java.util.Scanner;

public class Employee {
	
	String firstName;
	String lastName;
	double salary;
	

	
	void acceptEmployee() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		 firstName=sc.next();
		System.out.println("Enter the last name");
		 lastName=sc.next();
		System.out.println("Enter the Salary");
		 salary=sc.nextDouble();
		 
		 do{
				if(salary<0) {
					System.out.println("Error :salary cannot be negative");
					System.out.println("Enter the Salary");
					 salary=sc.nextDouble();
					
				}
			} while(salary<0);
	}
	

	

	
	void display() {
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("Salary :"+salary);
		System.out.println("Yearly Salary :"+(salary+(salary*0.10)));
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Employee emp=new Employee();
//		emp.acceptEmployee();
//		emp.display();
//		
//		Employee emp1=new Employee();
//		emp1.acceptEmployee();
//		emp1.display();
		
		

		

	//}

}
