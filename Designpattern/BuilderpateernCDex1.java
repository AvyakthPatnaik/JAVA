package Designpattern;

import java.util.ArrayList;
import java.util.List;

interface Packing{
	public String pack();
	public int price();
}
abstract class CD implements Packing{
	public abstract String pack();
}
abstract class Company extends CD{
	public abstract int price();
}
class Sony extends Company{
	public int price() {
		return 20;
	}
	public String pack() {
		return "Sony CD";
	}
}
class Samsung extends Company{

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 35;
	}

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Samsung CD";
	}
}
class CDType {
	private List<Packing>items=new ArrayList<Packing>();
	 public void addItem(Packing packs) {    
         items.add(packs);  
  }  
  public void getCost(){  
   for (Packing packs : items) {  
             packs.price();  
   }   
  }  
  public void showItems(){  
   for (Packing packing : items){  
  System.out.print("CD name : "+packing.pack());  
  System.out.println(", Price : "+packing.price());  
}       
 }     
}
class CDBuilder {  
    public CDType buildSonyCD(){   
       CDType cds=new CDType();  
       cds.addItem(new Sony());  
       return cds;  
}  
   public CDType buildSamsungCD(){  
     CDType cds=new CDType();  
     cds.addItem(new Samsung());  
     return cds;  
}  
}
public class BuilderpateernCDex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDBuilder cc=new CDBuilder();
		CDType type1=cc.buildSonyCD();
		type1.showItems();
		CDType type2=cc.buildSamsungCD();
		type2.showItems();
	}

}
