package first;

import java.util.Scanner;

public class AssignmentNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);		


//int choice=0;

int Dosa=50;
int Samosa=20;
int Idli=60;
int dosaTotal=0;
int samosaTotal=0;
int idliTotal=0;
int totalBill=0;
int choice=0;
do {

System.out.println("0. Exit");
System.out.println("1. Dosa");
System.out.println("2. Samosa");
System.out.println("3. Idli");
System.out.println("4. Generate the Bill");
System.out.println("Choose The Food :");
choice=sc.nextInt();

switch (choice) {
case 1: 
	System.out.println("Enter the quantity :");
	int dosaQuantity=sc.nextInt();
	if(dosaQuantity>0) {
		 dosaTotal=dosaQuantity*Dosa;
		 totalBill=totalBill+dosaTotal;
		 
	}
	break;
case 2:
	System.out.println("Enter the quantity :");
	int samosaQuantity=sc.nextInt();
	if(samosaQuantity>0) {
		 samosaTotal=samosaQuantity*Samosa;
		 totalBill=totalBill+samosaTotal;
	}
	break;

case 3:
	System.out.println("Enter the quantity :");
	int idliQuantity=sc.nextInt();
	if(idliQuantity>0) {
		 idliTotal=idliQuantity*Idli;
		 totalBill=totalBill+idliTotal;
		 
	}
	break;
	
case 4:
	System.out.println("Your total Bill :"+totalBill);
	choice=0;
	break;
default:
	System.out.println("You Choose Wrong choice");
	break;
}

} while(choice!=0); 

//System.out.println("Your Total Bill:"+totalBill);
	}

}
