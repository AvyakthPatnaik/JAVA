package Designpattern;
import java.util.*;
interface Employee{
	public int getid();
	public String getName();
	public double getSalary();
	public void Print();
	public void add(Employee employee);
	public void remove( Employee employee);
	public Employee getchild(int i);
}
class BankManager implements Employee{
	int id;
	String name;
	double salary;
	public BankManager(int id,String name,double salary) {  
	      this.id=id;      
	      this.name = name;  
	      this.salary = salary;  
	     }
	  List<Employee> employees = new ArrayList<Employee>();
	  public void add(Employee employee) {  
	        employees.add(employee);  
	     }  
	  public Employee getchild(int i) {  
	      return employees.get(i);  
	     }  
	  public void remove(Employee employee) {  
	      employees.remove(employee);  
	     }   
	  public int getid()  {  
	      return id;  
	     }  
	  public String getName() {  
	      return name;  
	     } 
	  public double getSalary() {  
	      return salary;  
	     }  
	  public void Print() {  
	      System.out.println("==========================");  
	      System.out.println("Id ="+getid());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("=========================="); 
	      Iterator<Employee> it = employees.iterator();  
          while(it.hasNext())  {  
            Employee employee = it.next();  
            employee.Print(); 
          }
	  }	
}
class Cashier implements Employee{
	private int id;  
    private String name;  
    private double salary;  
    public Cashier(int id,String name,double salary)  {  
    this.id=id;  
    this.name = name;  
    this.salary = salary; 
}
	@Override
	public int getid() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void Print() {
		System.out.println("==========================");  
        System.out.println("Id ="+getid());  
        System.out.println("Name ="+getName());  
        System.out.println("Salary ="+getSalary());  
        System.out.println("==========================");
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getchild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Accountant implements Employee{
   private int id;  
   private String name;  
   private double salary;  
   public Accountant(int id,String name,double salary)  {  
       this.id=id;  
       this.name = name;  
       this.salary = salary;
   }
@Override
public int getid() {
	// TODO Auto-generated method stub
	return id;
}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
@Override
public double getSalary() {
	// TODO Auto-generated method stub
	return salary;
}
@Override
public void Print() {
	// TODO Auto-generated method stub
	System.out.println("==========================");  
    System.out.println("Id ="+getid());  
    System.out.println("Name ="+getName());  
    System.out.println("Salary ="+getSalary());  
    System.out.println("==========================");
	
}
@Override
public void add(Employee employee) {
	// TODO Auto-generated method stub
	
}
@Override
public void remove(Employee employee) {
	// TODO Auto-generated method stub
	
}
@Override
public Employee getchild(int i) {
	// TODO Auto-generated method stub
	return null;
}
   
}
public class CompositePatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);   
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
         manager1.add(emp1);  
         manager1.add(emp2);  
         manager1.add(emp3);  
         manager1.Print(); 
	}

}
