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
		Student s2=new Student("16",60);
		set.add(s2);
		Student s3=new Student("19",50);
		set.add(s3);
		Student s4=new Student("15",70);
		set.add(s4);
		
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			int i=student.getAge();
			if(i>=21) {
				System.out.println(i);
			}
			System.out.println("Age=" + student.getAge() + " " + "RollNO"+ student.getRollno());
	 }
	 
	 }
}

