package com.app.geometry;

public class Point2DTest {

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
