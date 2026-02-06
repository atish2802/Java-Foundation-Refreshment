package Java8.ConstructorRef;

public class Main {
	public static void main(String[] args) {
		System.out.println("Costructor Reference ");
		
//		StudentInter studentInter =() -> {
//			return new Student();
//		}; 
		
		//Constructor Reference
		StudentInter studentInter1 = Student::new;
		Student student = studentInter1.getStudent();
		
		
		
//		Student student = studentInter.getStudent();
		student.display();
	
	}
}
