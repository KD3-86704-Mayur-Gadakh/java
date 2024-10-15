package first;

import java.util.Scanner;

public class AssignmentNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		System.out.println("Given Number :"+num);
		System.out.println("Binary Equivalant :"+Integer.toBinaryString(num));
		System.out.println("Binary Equivalant :"+Integer.toOctalString(num));
		System.out.println("Binary Equivalant :"+Integer.toHexString(num));	

	}

}
