package Designpattern;
import java.util.ArrayList;
import java.util.List;
interface Question{
	public void nextquestion();
	public void Previousquestion();
	public void newquestion(String q);
	public void deletequestion(String q);
	public void displayquestion();
	public void displayallquestion();
}
class JavaQuestion implements Question{
	private List <String> questions = new ArrayList<String>();
	private int current = 0;
	public JavaQuestion() {
	questions.add("What is class? ");  
    questions.add("What is interface? ");  
    questions.add("What is abstraction? ");  
    questions.add("How multiple polymorphism is achieved in java? ");  
    questions.add("How many types of exception  handling are there in java? ");  
    questions.add("Define the keyword final for  variable, method, and class in java? ");  
    questions.add("What is abstract class? ");  
    questions.add("What is multi-threading? ");
	}
	@Override
	public void nextquestion() {
		if( current <= questions.size()-1 )  
		    current++;  
		    System.out.print(current);
	}

	@Override
	public void Previousquestion() {
		 if( current > 0 )  
			    current--;  
	}

	@Override
	public void newquestion(String q) {
		 questions.addAll(questions);
	}

	@Override
	public void deletequestion(String q) {
		questions.remove(questions);
	}

	@Override
	public void displayquestion() {
		System.out.println( questions.get(current) ); 
	}

	@Override
	public void displayallquestion() {
		for (String quest : questions) {  
		    System.out.println(quest);  
		 }  
	}
}
class QuestionManager  {  
    protected Question q;  
    public String catalog;  
    public QuestionManager(String catalog) {  
    this.catalog=catalog;  
    }  
    public void next() {  
    q.nextquestion();  
    }  
    public void previous() {  
    q.Previousquestion();  
    }  
    public void newOne(String quest) {  
    q.newquestion(quest);  
    }  
    public void delete(String quest) {  
    q.deletequestion(quest);  
    }  
    public void display() {  
    q.displayquestion();  
    }  
    public void displayAll() {  
        System.out.println("Question Paper: " + catalog);  
    q.displayallquestion();  
    }  
}
class QuestionFormat extends QuestionManager {  
    public QuestionFormat(String catalog){  
        super(catalog);  
    }  
    public void displayAll() {  
        System.out.println("\n---------------------------------------------------------");  
        super.displayAll();  
        System.out.println("-----------------------------------------------------------");  
    }  
}
public class BridgePatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 QuestionFormat questions = new QuestionFormat("Java Programming Language");  
		 questions.q = new JavaQuestion();  
		 questions.delete("what is class?");  
		 questions.display();  
		 questions.newOne("What is inheritance? ");  
		 questions.newOne("How many types of inheritance are there in java?");  
		 questions.displayAll();  
	}
}
