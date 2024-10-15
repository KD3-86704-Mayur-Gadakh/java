package first;
import java.util.Scanner;

public class AssignmentNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entet the num1 :");

		Scanner sc=new Scanner(System.in);
		
if(sc.hasNextDouble() && !sc.hasNextInt()) {
	double num1=sc.nextDouble();
	System.out.println("Entet the num2 :");
	if(sc.hasNextDouble() && !sc.hasNextInt()) {
		
	}

	
	double num2=sc.nextDouble();
	double result=num1+num2/2;
	System.out.println("result :"+result);
}else {
	System.out.println("value is not double");
}
	}

}
