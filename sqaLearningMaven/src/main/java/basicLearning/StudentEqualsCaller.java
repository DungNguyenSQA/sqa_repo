package basicLearning;

public class StudentEqualsCaller {
	
	public static void main(String args[]){
		Student s1 = new Student(1,"Roy",3);
		Student s2 = new Student(1,"Roy",3);
			
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		System.out.println("s1 == s2 = "+(s1 == s2));
	}			
}
