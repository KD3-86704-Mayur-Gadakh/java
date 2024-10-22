package com.app.fruits;

import java.util.Scanner;

abstract class Fruit{
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	

	public void setColor(String color) {
		this.color = color;
	}

	

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	public void setName(String name) {
		this.name = name;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	Fruit() {}
	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	void acceptFruit(Scanner sc) {
		System.out.println("Enter the Fruit color :");
		color=sc.next();
		System.out.println("Enter the Fruit weight :");
		weight=sc.nextDouble();
		System.out.println("Enter the Fruit name :");
		name=sc.next();
		System.out.println("Fruit is fresh or not :");
		isFresh=sc.nextBoolean();
		
		if(isFresh) {
			System.out.println("Fruit is fresh");
//			setFresh(isFresh);
		}
		else {
			System.out.println("Fruit is Stale");
		}
		
		
	}
	
	abstract public String taste();
	


	@Override
	public String toString() {
		
		return "color :"+color+" "+"weight :"+weight+" "+"name "+name;
	}
	
	
}


class Apple extends Fruit{

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	public Apple() {
		
	}

	//this is ,main accept the apple properties 
	@Override
	void acceptFruit(Scanner sc) {
	
		super.acceptFruit(sc);
	}

	//this return the test os the fruit
	@Override
	public String taste() {
		
		return "sweet n sour";
	}
		
}

class Orange extends Fruit{

	public Orange() {
	}
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	}
	
	//this accept the orange
	@Override
	void acceptFruit(Scanner sc) {
		
		super.acceptFruit(sc);
	}

	
	//this will return the taste 
	@Override
	public String taste() {
	
		return "sour";
	}
	

}

class Mango extends Fruit{
	
	Mango(){}

	//ctor of the fruit
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	
	}

	
	//to accept the mango properties
	@Override
	void acceptFruit(Scanner sc) {
		
		super.acceptFruit(sc);
	}


	@Override
	public String taste() {
		
		return "sweet";
	}
}

public   class FruitBasket {
	
	
	public static int menu(Scanner sc) {
		
		System.out.println("********Welcome***********");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apples");
		System.out.println("4. Display All Fruits");
		System.out.println("5. Display all properties from basket :");
		System.out.println("6. Taste of all stales");
//		System.out.println();
//		System.out.println();
		return sc.nextInt();
//		System.out.println("0. Exit");
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the basket Size :");
	int size=sc.nextInt();
//		Fruit o=new Orange("red",12,"ornage",true);
////		o.acceptFruit(sc);
//////		o.displayFruit();
//		
//		System.out.println(o.toString());
//		System.out.println(o.taste());
//		
//
//	}
int choice;
Fruit f=null;
//boolean isFresh=false;
Fruit [] basket=new Fruit[size];
int basketIndex=0;
	while((choice=menu(sc))!=0) {
		
		switch (choice) {
		case 1:
			if(basketIndex<size) {
			basket[basketIndex]=new Mango("Yellow",12,"ornage",false);
			basketIndex++;}
			else {
				System.out.println("Basket is full");
			}
			break;
			
		case 2:
			if(basketIndex<size) {
			basket[basketIndex]=new Apple("red",13,"Apple",true);
			basketIndex++;
			}else {
				System.out.println("Basket is Full");
			}
			break;
			
		case 3:
			if(basketIndex<size) {
			basket[basketIndex]=new Orange("orange",15,"ornage",true);
			basketIndex++;
			}
			else {
				System.out.println("Bakset is Full");
			}
			break;
			
		case 4:
			for(int i=0;i<basket.length;i++) {
				System.out.println("element :"+basket[i]);
			}
			break;
		case 5:
			for(int i=0;i<basket.length;i++) {
				if(basket[i]!=null && basket[i].isFresh) {
					System.out.println("fruit in the list :"+basket[i]);
					System.out.println("Test of fruit is :"+basket[i].name +" = "+ basket[i].taste());
				}
				else {
					System.out.println("xxxxx");
				}
			}
			break;
			
		case 6:
			for(int i=0;i<basket.length;i++) {
				if( basket[i]!=null && basket[i].isFresh ==false ) {
					System.out.println("test of the stale fruit is :"+basket[i].taste());
				}else {
					System.out.println("No stale fruits");
				}
			}
			break;
		case 7:
			int staleFruit;
			
			System.out.println("Enter the index of friut  to make it stale : ");
			
			staleFruit=sc.nextInt();
			if(staleFruit <0 || staleFruit>size) {
				System.out.println("Index not Found");
				
			}
			else {
				basket[staleFruit].setFresh(false);;
			}
			break;
			
		case 8:
			for (int i=0;i<basket.length;i++) {
				if(basket[i] !=null && basket[i].taste().equals("sour")) {
					basket[i].setFresh(false);
				}
			}
		default: System.out.println("Wrong choice");
			
			break;
		}
		
	}


}
}