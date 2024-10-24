package com.sunbeam;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private String city;
	private double marks;
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	public Student(int rollNo, String name, String city, double marks) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	

	  @Override 
	  public String toString() {  return
	  "Student [name :"+name+",rollNo :"+rollNo+",city :"+city+",marks :"+marks+"]"; }
	 

	  @Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.rollNo -o.rollNo;
		}

}
