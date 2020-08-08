package demo3;

import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class StudentMain {
    public static void main(String args[]) {
	StudentMain s=new StudentMain();
	s.runapp();
    }
    
	
	
	 void runapp() {
		Set<Student> set=new HashSet<Student>();
		Student s1=new Student("11",20);
		set.add(s1);
		Student s2=new Student("16",31);
		set.add(s2);
		Student s3=new Student("19",16);
		set.add(s3);
		Student s4=new Student("15",25);
		set.add(s4);
		
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			int i=student.getAge();
			if(i>=21) {
				List<Student> list =new ArrayList<>();
				list.add(student);
				System.out.println(i);
			}
			System.out.println("Age=" + student.getAge() + " " + "RollNO"+ student.getRollno());
	 }
	 
	 }
}

