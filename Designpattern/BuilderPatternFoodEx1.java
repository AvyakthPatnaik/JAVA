package Designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface item{
	public String name();
	public String size();
	public float price();
}
abstract class Pizza implements item{
	public abstract float price();
}
abstract class VegPizza extends Pizza{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}
class SmallCheese extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Cheese Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small Size";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 190f;
	}
}
class MediumChesse extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Medium Chesse Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Medium";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 210f;
	}
}
class LargeChesse extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Large Chesse pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250f;
	}
}
class ExtraLargeCheese extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "ExtraLargeCheese";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 280f;
	}
	
}
class SmallOnion extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Small Onion Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 190f;
	}
	
}
class MediumOnion extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Medium onion Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Medium";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 210f;
	}
	
}
class LargeOnion extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Large Onion Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250f;
	}
}
class ExtraLargeOnion extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "ExtraLargeOnion";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 280f;
	}
	
}
class SmallMasala extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "SmallMasala";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 190f;
	}
	
}
class MediumMasal extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Medium Masal Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Medium";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 210f;
	}
	
}
class LargeMasal extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "LargeMasal Pizza";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250f;
	}
}
class ExtraLargeMasal extends VegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "ExtraLargeMasal";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Extra Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 280f;
	}
	
}
abstract class NOnVegPizza extends Pizza{
	public abstract String name();
	public abstract String size();
	public abstract float price();
}
class SmallNonVeg extends NOnVegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "SmallNonVeg";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 200f;
	}
	
}
class LargeNonVeg extends NOnVegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "LargeNonVeg";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250f;
	}
	
}
class MediumNonVeg extends NOnVegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "MediumNonVeg";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "medium";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 220f;
	}
	
}
class ExtraLargeNonVeg extends NOnVegPizza{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "ExtralargeNonVeg";
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Extralarge";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 280f;
	}
}
abstract class CoolDrink implements item{
	public abstract float price();
}
abstract class Pespi extends CoolDrink{
	public abstract String name();
	public abstract float price();
	public abstract String size();
}
abstract class Coke extends CoolDrink{
	public abstract String name();
	public abstract float price();
	public abstract String size();
}
class Smallpespi extends Pespi{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pespi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 40f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}
	
}
class Mediumpespi extends Pespi{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pespi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 60f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Medium";
	}
	
}
class Largepespi extends Pespi{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pespi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 80f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}
	
}
class SmallCoke extends Coke{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 40f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Small";
	}
	
}
class Mediumcoke extends Coke{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 60f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Medium";
	}
	
}
class Largecoke extends Coke{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 80f;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return "Large";
	}
	
}
class Orderitems{
	List<item>li=new ArrayList<item>();
	public void addItems(item item){  
        li.add(item);  
    }  
    public float getCost(){           
        float cost=0.0f;  
            for (item item : li) {  
                cost+=item.price();  
             }  
        return cost;  
    }  
    public void showItems(){  
          
        for (item item : li) {  
            System.out.println("Item is:" +item.name());  
            System.out.println("Size is:" +item.size());  
            System.out.println("Price is: " +item.price());      
        }  
    }    
}
class OrderBuilder{
	public Orderitems preparePizza() throws IOException{  
        
        Orderitems itemsOrder=new Orderitems();  
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
          
        System.out.println(" Enter the choice of Pizza ");  
        System.out.println("============================");  
        System.out.println("        1. Veg-Pizza       ");  
        System.out.println("        2. Non-Veg Pizza   ");  
        System.out.println("        3. Exit            ");  
        System.out.println("============================");  
          
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());  
        switch(pizzaandcolddrinkchoice)   {
        case 1:{  
            
            System.out.println("You ordered Veg Pizza");  
            System.out.println("\n\n");  
            System.out.println(" Enter the types of Veg-Pizza ");  
            System.out.println("------------------------------");  
            System.out.println("        1.Cheeze Pizza        ");  
            System.out.println("        2.Onion Pizza        ");  
            System.out.println("        3.Masala Pizza        ");  
            System.out.println("        4.Exit            ");  
            System.out.println("------------------------------");  
                         int vegpizzachoice=Integer.parseInt(br.readLine());  
            switch(vegpizzachoice) {
        case 1:{
        	 System.out.println("You ordered Cheeze Pizza");  
             System.out.println("Enter the cheeze pizza size");  
             System.out.println("------------------------------------");  
             System.out.println("    1. Small Cheeze Pizza ");  
             System.out.println("    2. Medium Cheeze Pizza ");  
             System.out.println("    3. Large Cheeze Pizza ");  
             System.out.println("    4. Extra-Large Cheeze Pizza ");  
             System.out.println("------------------------------------");  
             int cheezepizzasize=Integer.parseInt(br.readLine());  
             switch(cheezepizzasize)  
             {
        case 1:  
            itemsOrder.addItems(new SmallCheese());  
            break;  
      case 2:  
            itemsOrder.addItems(new MediumChesse());  
            break;    
      case 3:  
            itemsOrder.addItems(new LargeChesse());  
            break;    
      case 4:  
            itemsOrder.addItems(new ExtraLargeCheese());  
            break;
             }
        }
        break;
	case 2:  
    {  
        System.out.println("You ordered Onion Pizza");  
        System.out.println("Enter the Onion pizza size");  
        System.out.println("----------------------------------");  
        System.out.println("    1. Small Onion Pizza ");  
        System.out.println("    2. Medium Onion Pizza ");  
        System.out.println("    3. Large Onion Pizza ");  
        System.out.println("    4. Extra-Large Onion Pizza ");  
        System.out.println("----------------------------------");  
        int onionpizzasize=Integer.parseInt(br.readLine());  
        switch(onionpizzasize)  
                  {  
                      case 1:  
                       itemsOrder.addItems(new SmallOnion());  
                       break;  
                          
                      case 2:  
                       itemsOrder.addItems(new MediumOnion());  
                       break;    
                         
                      case 3:  
                       itemsOrder.addItems(new LargeOnion());  
                       break;    
                            
                      case 4:  
                       itemsOrder.addItems(new ExtraLargeOnion());  
                       break;                
                }       
       }  
    break;  
	case 3:{
		 System.out.println("You ordered Masala Pizza");  
         System.out.println("Enter the Masala pizza size");  
         System.out.println("------------------------------------");  
         System.out.println("    1. Small Masala Pizza ");  
         System.out.println("    2. Medium Masala Pizza ");   
         System.out.println("    3. Large Masala Pizza ");  
         System.out.println("    4. Extra-Large Masala Pizza ");  
         System.out.println("------------------------------------");  
                       int masalapizzasize=Integer.parseInt(br.readLine());  
             switch(masalapizzasize)  
                   {  
                       case 1:  
                        itemsOrder.addItems(new SmallMasala());  
                        break;  
                           
                       case 2:  
                        itemsOrder.addItems(new MediumMasal());  
                        break;    
                          
                       case 3:  
                        itemsOrder.addItems(new LargeMasal());  
                        break;    
                             
                       case 4:  
                        itemsOrder.addItems(new ExtraLargeMasal());  
                       break;                    
                   }       
     }  
     break; 
            }
        }
        break;
case 2: {  
    System.out.println("You ordered Non-Veg Pizza");  
    System.out.println("\n\n");        
    System.out.println("Enter the Non-Veg pizza size");  
    System.out.println("------------------------------------");  
    System.out.println("    1. Small Non-Veg  Pizza ");  
    System.out.println("    2. Medium Non-Veg  Pizza ");  
    System.out.println("    3. Large Non-Veg  Pizza ");  
    System.out.println("    4. Extra-Large Non-Veg  Pizza ");  
    System.out.println("------------------------------------");  
    int nonvegpizzasize=Integer.parseInt(br.readLine());   
     switch(nonvegpizzasize)  
          {      
               case 1:  
                   itemsOrder.addItems(new SmallNonVeg());  
                   break;  
                                   
               case 2:  
                   itemsOrder.addItems(new MediumNonVeg());  
                   break;    
                                  
               case 3:  
                   itemsOrder.addItems(new LargeNonVeg());  
                   break;    
                                     
               case 4:  
                   itemsOrder.addItems(new ExtraLargeNonVeg());  
                   break;        
           }  
                   
    }    
     break;  
default:  {  
break;  
}  
	}
        System.out.println(" Enter the choice of ColdDrink ");  
        System.out.println("============================");  
        System.out.println("        1. Pepsi            ");  
        System.out.println("        2. Coke             ");  
        System.out.println("        3. Exit             ");  
        System.out.println("============================");    
                    int coldDrink=Integer.parseInt(br.readLine());  
        switch (coldDrink) {
        case 1:  
        {  
            System.out.println("You ordered Pepsi ");  
            System.out.println("Enter the  Pepsi Size ");  
            System.out.println("------------------------");  
            System.out.println("    1. Small Pepsi ");  
            System.out.println("    2. Medium Pepsi ");  
            System.out.println("    3. Large Pepsi ");  
            System.out.println("------------------------");  
                      int pepsisize=Integer.parseInt(br.readLine());  
            switch(pepsisize) {  
            case 1:  
                itemsOrder.addItems(new Smallpespi());  
                break;  
                   
               case 2:  
                itemsOrder.addItems(new Mediumpespi());  
                break;    
                  
               case 3:  
                itemsOrder.addItems(new Largepespi());  
                break;
            }
        }
        break;
	 case 2:  
     {  
         System.out.println("You ordered Coke");  
         System.out.println("Enter the Coke Size");  
         System.out.println("------------------------");  
         System.out.println("    1. Small Coke ");  
         System.out.println("    2. Medium Coke  ");  
         System.out.println("    3. Large Coke  ");  
         System.out.println("    4. Extra-Large Coke ");  
         System.out.println("------------------------");  
           
         int cokesize=Integer.parseInt(br.readLine());  
         switch(cokesize)  
                   {  
                       case 1:  
                        itemsOrder.addItems(new SmallCoke());  
                        break;  
                           
                       case 2:  
                        itemsOrder.addItems(new Mediumcoke());  
                        break;    
                          
                       case 3:  
                        itemsOrder.addItems(new Largecoke());  
                        break;    
                             
                         
                   }       
        
     }  
     break;  
default:  {  
           break;  
           }     
	}
	return itemsOrder;
	}
	}
public class BuilderPatternFoodEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 OrderBuilder builder=new OrderBuilder();  
         Orderitems orderedItems=builder.preparePizza();  
	     orderedItems.showItems();  
	     System.out.println("\n");  
	     System.out.println("Total Cost : "+ orderedItems.getCost());          
	}

}
