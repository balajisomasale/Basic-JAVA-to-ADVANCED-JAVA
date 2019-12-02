import java.lang.Math.*;
import java.util.Scanner;



class Shape{
	
	protected String shapeName; 
	
	
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}



	public double calculateArea()
	{
		
		
		return 0;
	}	
	
}

class Square extends Shape
{
	int side;
	
	
	public Square(int side) {
		super("Square");
		this.side = side;
	}


	public double calculateArea()
	{ 
		return (side*side);
		
	}
}
class Rectangle extends Shape
{
	int length,breadth;
	
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea()
	{
		
		return (length*breadth);
		
		
	}
	
	
	

}

class Circle extends Shape 
{
int radius;

public Circle(int radius) {
	super("Circle");
	this.radius = radius;
}

public double calculateArea()
{
	
	return ((Math.PI)*radius*radius);
	
	
}




}




public class Main {
public static void main(String[] args)
{
	int x;
	Scanner sc=new Scanner(System.in);
	System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
	x=sc.nextInt();
	
	switch(x)
	{
case 1:
	
	int l,b;
	System.out.println("Enter length and breadth:");
	l=sc.nextInt();
	b=sc.nextInt();
	Rectangle obj=new Rectangle(l,b);
	System.out.printf("Area of Rectangle is:%.2f",obj.calculateArea());
	break;
	
	case 2:
		
		int s;
		System.out.println("Enter side:");
		s=sc.nextInt();
		Square obj1=new Square(s);
		
		System.out.printf("Area of Square is:%.2f",obj1.calculateArea());
		
		
		break;
	case 3:
		
		int c;
		System.out.println("Enter Radius:");
		s=sc.nextInt();
		Circle obj2=new Circle(s);
		
		System.out.printf("Area of Circle is:%.2f",obj2.calculateArea());
		
		break;
	}
		

}
}
