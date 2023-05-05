package Designpattern;
import java.io.*;
abstract class Plan{
	protected double rate;
	abstract void getRate();
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
class DomesticPlan extends Plan{
	public void getRate() {
		rate=3.50;
	}
}
class CommericalPaln extends Plan{
	public void getRate() {
		rate=7.50;
	}
}
class InstitutionalPlan extends Plan{
	public void getRate() {
		rate=5.50;
	}
}
class  HospitalPlan extends Plan{
	void getRate() {
		rate=10.50;	
	}
}
class governmentbodyPlan extends Plan{
	void getRate() {
		rate=15.50;	
	}
}
class religioncenterPlan extends Plan{
	void getRate() {
		rate=3.50;	
	}
}
class getplanfactory{
		public Plan getPlan(String plantype) {
			if(plantype==null) {
				return null;
			}
			else if(plantype.equalsIgnoreCase("Domestic")){
				return new DomesticPlan();
			}
			else if(plantype.equalsIgnoreCase("Commerical")) {
				return new CommericalPaln();
			}
			else if(plantype.equalsIgnoreCase("Institutional")) {
				return new InstitutionalPlan();
			}
			else if(plantype.equalsIgnoreCase("HospitalPlan")) {
				return new HospitalPlan();
			}
			else if(plantype.equalsIgnoreCase("governmentbodyplan")) {
				return new governmentbodyPlan();
			}
			else if(plantype.equalsIgnoreCase("religioncenterPlan")){
				return new religioncenterPlan();
			}
			return null;
		}
}
public class FactorPatternex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getplanfactory planfactory=new getplanfactory();
		System.out.println("Enter number of plan for which bill we generate");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String planname=br.readLine();
		System.out.println("Enter the number of units for billwill be calculated");
		int units=Integer.parseInt(br.readLine());
		Plan p=planfactory.getPlan(planname);
		System.out.println("Bill amount for"+planname+"of"+units+"units is");
		p.getRate();
		p.calculateBill(units);
	}
}
