package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	int xcordinate;
	int ycordinate;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x cordinate");
		 xcordinate=sc.nextInt();
		System.out.println("Enter the y cordinate");	
		 ycordinate=sc.nextInt();
	}
	
	
	public Point2D() {
		
				
}
public Point2D(int xcordinate, int ycordinate) {
	
		this.xcordinate = xcordinate;
		this.ycordinate = ycordinate;
		
}


public String getDeatails() {
	
	System.out.println("wrew"+this.xcordinate);
	System.out.println("wrew"+this.ycordinate);
	
	return "Xcordinate :"+this.xcordinate+":"+"Ycordinate"+this.ycordinate;
	
}

public boolean isEqual(Point2D o) {
	

	
	
	return (this.xcordinate==o.xcordinate && this.ycordinate==o.ycordinate);
}

public double calculateDistance(Point2D pt) {

	
	return Math.sqrt(Math.pow((this.xcordinate- pt.xcordinate),2)+Math.pow((this.ycordinate-pt.ycordinate),2));
}



	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Point2D pt=new Point2D();
		pt.accept();
		Point2D pt1=new Point2D();
		pt1.accept();
		System.out.println(pt.getDeatails()); 
		System.out.println("the point p1 and p2 are :"+pt.isEqual(pt1));
		
		if(!pt.isEqual(pt1)){
			
			System.out.println(" Distance between p1 and p2 "+pt1.calculateDistance(pt)) ;
		}
	

	}

}
