
//Q3. Write a java code to check string is palindrome

package com.sunbeam;

public class AssignmentQ3 {

	public static void main(String[] args) {
	
		String s="bba";
		String newS="";
//		String[] arr=new String;
		
		for(int i=s.length()-1;i>=0;i--) {
		newS=newS+s.charAt(i);	
		}
		
		if(s.equals(newS)) {
			System.out.println("Given string is palindrom");
		}
		else {
			System.out.println("Given string is not palindrom");
		}

	}

}
