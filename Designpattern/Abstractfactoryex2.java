package Designpattern;
import java.io.*;
import java.util.List;
interface Shape11{
	void draw();
}
class Square11 implements Shape11{
	public void draw() {
		System.out.println("Square");
	}
}
class Rectangle11 implements Shape11{
	public void draw() {
		System.out.println("Rectangle");
	}
}
class RoundedRectangle11 implements Shape11{
	public void draw() {
		System.out.println("RoundedRectangle");
	}
}
class RoundedSquare11 implements Shape11{
	public void draw() {
		System.out.println("RoundedSquare");
	}
}
abstract class abstractfactory11{
	public abstract Shape11 getshape(String shape);
}
class Shapefactory11 extends abstractfactory11{
	public  Shape11 getshape(String shape) {
		if(shape.equalsIgnoreCase("Square")) {
			return new Square11();
		}else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle11();
		}
		return null;
	}
}
class Roundedfactory11 extends abstractfactory11{
	public Shape11 getshape(String rounded) {	
		 if (rounded.equalsIgnoreCase("RoundedRectangle")) {
			return new RoundedRectangle11();
		}else if(rounded.equalsIgnoreCase("RoundedSquare")) {
			return new RoundedSquare11();
		}
		return null;
	}
}
class factoryproducer{
	public static abstractfactory11 getfactory(String type) {
		if(type.equalsIgnoreCase("SHAPE")) {
			return new Shapefactory11();
		}else if(type.equalsIgnoreCase("Rounded")) {
			return new Roundedfactory11();
		}
		return null;
	}
}
public class Abstractfactoryex2{
	public static void main(String[] args) throws IOException {
		   abstractfactory11 sf = factoryproducer.getfactory("SHAPE");
		   Shape11 shape1 = sf.getshape("RECTANGLE");
		   shape1.draw();
		   Shape11 shape2 = sf.getshape("SQUARE");
		   shape2.draw();
		   abstractfactory11 rf = factoryproducer.getfactory("ROUNDED");
		   Shape11 shape3 = rf.getshape("RoundedRECTANGLE");
		   shape3.draw();
		   Shape11 shape4 = rf.getshape("RoundedSQUARE");
		   shape4.draw();
	} 
}