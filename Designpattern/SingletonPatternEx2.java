package Designpattern;
class SingleObject{
	private static SingleObject instance=new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance(){
	      return instance;
	   }
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
public class SingletonPatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
