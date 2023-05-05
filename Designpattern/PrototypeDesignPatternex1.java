package Designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Prototype{
	public Prototype getclone();
}
class EmployeeRecord implements Prototype{
	int id;
	String address,designation,name;
	double Salary;
	public EmployeeRecord(int id,String name,String designation,double Salary,String address) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.address=address;
		this.Salary=Salary;
	}
	public void showRecord() {
		System.out.println("Name\tid\tSalary\taddress\tdesignation");
		System.out.println(name+"\t"+id+"\t"+Salary+"\t"+address+"\t"+designation);
	}
	public Prototype getclone() {
		return new EmployeeRecord(id,name,designation,Salary,address);
	}
}
public class PrototypeDesignPatternex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");          
        System.out.print("Enter Employee Name: ");  
        String ename=br.readLine();  
        System.out.print("\n");          
        System.out.print("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");          
        System.out.print("Enter Employee Address: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");           
        System.out.print("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");            
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getclone();  
        e2.showRecord(); 
	}

}
