/*
 Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
strings is too long". Write a program that reads a String from user and calculates its length. and 
throws an exception of type ExceptionLineTooLong in the case where a string of length is more 
than 80 characters.
(Hint- Use String class length() method)

 */

package com.sunbeam;


import java.util.Scanner;

import com.sunbeam.exception.ExceptionLineTooLong;

class Exception{

	String s="";
	public void test(Scanner sc) throws ExceptionLineTooLong {

		System.out.println("Enter the string :");
		s=sc.nextLine();
		
		if(s.length()>80) {
		throw new ExceptionLineTooLong("Lines are greater than 80");	
		}
		
	}
}


public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Exception e=new Exception();
		try {
			e.test(sc);
		} catch (ExceptionLineTooLong e1) {
			
			e1.printStackTrace();
		}

	}

}
