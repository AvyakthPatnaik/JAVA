package Designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface bank{
	String getbankName();
}
class HDFC implements bank{
	private final String BName;
	public HDFC() {
		BName="HDFC";
	}
	public String getbankName() {
		return BName;
	}
	
}
class ICICI implements bank{
	private String BName="ICICI";
	
	public String getbankName() {
		return BName;
	}
}
class SBI implements bank{
	private String BName="SBI";
	
	public String getbankName() {
		return BName;
	}
}
abstract class loan{
	protected double rate;  
	abstract void getInterestRate(double rate);  
	public void calculateLoanPayment(double loanamount, int years){
		 double EMI;  
         int n;  
         n=years*12;  
         rate=rate/1200;  
         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     
	}
}
class HomeLoan extends loan{
	void getInterestRate(double r) {
		rate=r;
	}	
}
class BussinessLoan extends loan{  
    public void getInterestRate(double r){  
          rate=r;  
     }  
}
class EducationLoan extends loan{  
    public void getInterestRate(double r){  
      rate=r;  
}  
}
abstract class AbstractFactory{  
	  public abstract bank getBank(String bank);  
	  public abstract loan getLoan(String loan);  
	}  
class BankFactory extends AbstractFactory{  
	   public bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("HDFC")){  
	         return new HDFC();  
	      } else if(bank.equalsIgnoreCase("ICICI")){  
	         return new ICICI();  
	      } else if(bank.equalsIgnoreCase("SBI")){  
	         return new SBI();  
	      }  
	      return null;  
	   }
	public loan getLoan(String loan) {
		return null;
     }    
}
class LoanFactory extends AbstractFactory{  
    public bank getBank(String bank){  
         return null;  
   }  
     public loan getLoan(String loan){  
     if(loan == null){  
       return null;  
    }  
     if(loan.equalsIgnoreCase("Home")){  
        return new HomeLoan();  
    } else if(loan.equalsIgnoreCase("Business")){  
        return new BussinessLoan();  
    } else if(loan.equalsIgnoreCase("Education")){  
        return new EducationLoan();  
    }  
       return null;  
   }  
}  
class FactoryCreator {  
    public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("Bank")){  
        return new BankFactory();  
     } else if(choice.equalsIgnoreCase("Loan")){  
        return new LoanFactory();  
     }  
     return null;  
  }  
}
public class Abstractfactoryplanex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      System.out.print("Enter the name of Bank from where you want to take loan amount: ");  
	      String bankName=br.readLine();  
	      System.out.print("\n");  
	      System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");    
	      String loanName=br.readLine();  
	      AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
	      bank b=bankFactory.getBank(bankName);    
	      System.out.print("\n");  
	      System.out.print("Enter the interest rate for "+b.getbankName()+ ": ");    
	      double rate=Double.parseDouble(br.readLine());  
	      System.out.print("\n");  
	      System.out.print("Enter the loan amount you want to take: ");  	  
	      double loanAmount=Double.parseDouble(br.readLine());  
	      System.out.print("\n");  
	      System.out.print("Enter the number of years to pay your entire loan amount: ");  
	      int years=Integer.parseInt(br.readLine());  	  
	      System.out.print("\n");  
	      System.out.println("you are taking the loan from "+ b.getbankName());    
	      AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
	      loan l=loanFactory.getLoan(loanName);  
	      l.getInterestRate(rate);  
	      l.calculateLoanPayment(loanAmount,years);  
	}
}
