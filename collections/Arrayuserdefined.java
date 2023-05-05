package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno,age;
	String name;
	Student(int rollno,int age,String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}
public class Arrayuserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(74,12,"sasi");
		Student s2=new Student(52,12,"Abhi");
		Student s3=new Student(45,12,"Dani");
		ArrayList<Student> al=new ArrayList<Student>();  
		  al.add(s1);  
		  al.add(s2);  
		  al.add(s3);   
		  Iterator itr=al.iterator();    
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  } 
	}

}
