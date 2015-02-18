package basicLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionObjectExample {
	
	public static void main(String args[]){
		Student s1 = new Student(100,"Jack",2);
		Student s2 = new Student(400,"John",4);
		Student s3 = new Student(600,"Joe",6);
		Student s4 = new Student(200,"Robert",2);
		Student s5 = new Student(300,"Dave",5);
		Student s6 = new Student(600,"Joe",6);
		Student s7 = new Student(500,"Kim",1);
		
		//First store them into a list
		//Student[] stdArr = new Student[5];
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s7);
		studentList.add(s3);
		studentList.add(s6);
		studentList.add(s2);
		studentList.add(s5);
		studentList.add(s4);
		
		for(Student std : studentList){
			System.out.println("Id = "+std.getId()+", Name = "+std.getName()+" and  "
					+ "grade = "+std.getGrade());
		}
		
		//Set of student objects
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(s1);
		studentSet.add(s7);
		studentSet.add(s3);
		studentSet.add(s6);
		studentSet.add(s2);
		studentSet.add(s5);
		studentSet.add(s4);
		System.out.println("************** Using the Hash set now **************");
		for(Student std : studentSet){
			System.out.println("Id = "+std.getId()+", Name = "+std.getName()+" and  "
					+ "grade = "+std.getGrade());
		}
		
		//Using the HashMap
		Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
		studentMap.put(1, s1);
		studentMap.put(2, s2);
		studentMap.put(3, s3);
		studentMap.put(4, s4);
		studentMap.put(5, s5);
		studentMap.put(6, s6);
		studentMap.put(7, s7);
		studentMap.put(1, s7);
		System.out.println("************** Using the HashMap now **************");
		for(Map.Entry<Integer,Student> entry : studentMap.entrySet()){
			Integer key = entry.getKey();
			Student stdValue = entry.getValue();
			System.out.println("For Key="+key+" student object is : "+stdValue.getId()+
					", name="+stdValue.getName()+", grade="+stdValue.getGrade());
		}
	}
}
