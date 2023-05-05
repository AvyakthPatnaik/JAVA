package collections;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
	int rollno,age;
	String name;
	Students(int rollno,int age,String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	public int compareTo(Students o) {
		if(age==o.age) { 
			return 0;  
		}
			else if(age>o.age) {  
			return 1;  
			}
			else  {
			return -1;  
		}
	}  
}
public class Compareex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,23,"Vijay"));  
		al.add(new Student(106,27,"Ajay"));  
		al.add(new Student(105,21,"Jai"));  	  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age); 
		}

	}

}
