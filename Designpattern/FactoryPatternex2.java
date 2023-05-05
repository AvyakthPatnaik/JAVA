package Designpattern;
import java.io.*;
interface Shape{
	void draw();
	void getArea();
}
class Circle implements Shape{
	public void draw() {
		String draw="Cricel";
		System.out.println("Shapeof object :"+draw);
	}
	public void getArea() {
		double r = 15;
		double pi=3.14;
		double Area=pi*r*r;
		System.out.println("Area of Cricle: "+Area);
	}
}
class Square implements Shape{
	public void draw() {
		String draw="Square";
		System.out.println("Shapeof object :"+draw);
	}
	public void getArea() {
		int side = 25;
		int Area=side*side;
		System.out.println("Area of Square: "+Area);
	}
}
class Recatangle implements Shape{
	public void draw() {
		String draw="Recatangle";
		System.out.println("Shapeof object :"+draw);
	}
	public void getArea() {
		int l= 45;
		int b=26;
		int Area=l*b;
		System.out.println("Area of Rectangle: "+Area);
	}
}
class Shapefactory{
	public static Shape getdraw(String shape) {
		if(shape==null) {
			return null;
		}
		else if(shape.equalsIgnoreCase("Cricle")) {
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Recatangle();
		}
		return null;
	}
}

public class FactoryPatternex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Shapefactory sf=new Shapefactory();
		System.out.println("Enter identity:: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fig=br.readLine(); 
		Shape ss=Shapefactory.getdraw(fig);
		ss.draw();
		ss.getArea();
	}
}
