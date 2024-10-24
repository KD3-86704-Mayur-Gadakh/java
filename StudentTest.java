package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


//city comparator
		class cityComparitor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
		
		//marks comapartor
		
	class MarksComparator implements Comparator<Student>{
	@Override
	public int compare(Student o2, Student o1) {				
	return Double.compare(o1.getMarks(),o2.getMarks());	
	}
			
}
	
	//name comapator
	class NameComparitor implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
		
		

public class StudentTest {
	
	public static int menu(Scanner sc) {
		System.out.println("**********************");
		System.out.println("0. Exit");
		System.out.println("1. Display All Students");
		System.out.println("2. Sort Student on their city ");
		System.out.println("3. Sort Student on their marks ");
		System.out.println("4. sort students on their name ");
		System.out.println("5. sort student on their roll no ");
		System.out.println("***********************");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
	return choice;
	}
	
	public static void displayAllStudent(Student []std) {
		
		System.out.println("***********************");
		for (Student student : std) {
		System.out.println(student);	
		}
		System.out.println("***********************");
	}
	
	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);		
		Student std[]=new Student[5];
//		menu(sc);
//		int choice;
		cityComparitor cm;
		std[0]=new Student(1, "mayur","Pune", 90);
		std[1]=new Student(4, "onkar","karad", 80);
		std[2]=new Student(3, "tanmay","nagar", 76);
		std[3]=new Student(5, "reddy","nashik", 89);
		std[4]=new Student(2, "nishad","nagpur", 99);
		
		
		int choice;
		while((choice=menu(sc))!=0) {
			
			switch (choice) {
			
			case 1:
				for (Student student : std) {
					System.out.println(student);
				}
				break;
			case 2:
				cm=new cityComparitor();
				Arrays.sort(std,cm);		
				System.out.println("Arrays after city sort");	
				displayAllStudent(std);
				
				break;
				
			case 3:
				//marks comparator
				MarksComparator mc=new MarksComparator();	
				Arrays.sort(std,mc);		
				System.out.println("After the marks sorting :");		
				displayAllStudent(std);
				
				break;
				
			case 4:
				//name comparator
				NameComparitor nm=new NameComparitor();
				Arrays.sort(std,nm);
				System.out.println("Arrays after name sort");
				displayAllStudent(std);
				
				break;
				
			case 5:Arrays.sort(std);
				displayAllStudent(std);
			break;
				
			default:
				System.out.println("wrong choice");
				break;
			}
			
		}
		

//city comparator
		
		
			
		
		
		
		
		
		
		
		
	}
}
