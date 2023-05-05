package collections;

import java.util.Stack;

public class Stackpushpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>s=new Stack<String>();
		s.push("Jam");
		s.push("jimmy");
		s.push("jhon");
		for(String ss:s) {
			System.out.println(ss);
		}
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}

}
