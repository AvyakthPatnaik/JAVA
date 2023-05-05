package Designpattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Cerditcard{
	public void getBankdetails();
	public String getcerditcard();
}
class Bankdetails{
	String Bankname;
	String accHoldername;
	long accNumber;
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String Bankname) {
		this.Bankname=Bankname;
	}
	public String getaccHoldername() {
		return accHoldername;
	}
	public void setaccHoldername(String accHoldername) {
		this.accHoldername=accHoldername;
	}
	public long getaccNumber() {
		return accNumber;
	}
	public void setaccNumber(long accNumber) {
		this.accNumber=accNumber;
	}
}
class Bankcustomer extends Bankdetails implements Cerditcard{

	public void getBankdetails() {
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the account holder name :");  
			   String customername=br.readLine();  
			   System.out.print("\n");        
			   System.out.print("Enter the account number:");  
			   long accno=Long.parseLong(br.readLine());  
			   System.out.print("\n");        
			   System.out.print("Enter the bank name :");  
			   String bankname=br.readLine();        
			   setaccHoldername(customername);  
			   setaccNumber(accno);  
			   setBankname(bankname);
		}catch(Exception h) {
			h.printStackTrace();
		}
	}

	public String getcerditcard() {
		long accno=getaccNumber();  
		String accholdername=getaccHoldername();  
		String bname=getBankname();        
	return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
		  }  
}
public class AdpaterPatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerditcard targetInterface=new Bankcustomer();  
		targetInterface.getBankdetails();  
		System.out.println
		(targetInterface.getcerditcard());  
	}

}
