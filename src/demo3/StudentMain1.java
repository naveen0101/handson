package demo3;
import java.util.*;

public class StudentMain1 {
	 private Set<Student1> set = new HashSet<>();
	private Map<String, Student1> stud = new HashMap();

	public static void main(String[] args) {
		StudentMain1 run = new StudentMain1();
		run.runApp();
	}

	public void runApp() {
		Student1 a1= new Student1("1a",25, "chotu");
		stud.put("1a",a1);
		Student1 a2= new Student1("1b",22, "chinnu");
		stud.put("1b",a2);
		Student1 a3= new Student1("2a",56, "naveen");
		stud.put("2a",a3);
		Student1 a4= new Student1("2b",31, "chinna");
		stud.put("2b",a4);
		
		app();
	}

	public void app() {
		Set<String> keys = stud.keySet();
		for (String k : keys) {
			Student1 s = stud.get(k);
		
			if (s.getAge() % 2 == 0) {
				System.out.println("age is even=" + s.getAge());
			} else {
				System.out.println("age is odd=" + s.getAge());
			}
			
			List<String>a= new ArrayList();
		    a.add(s.getRollNo());

			for (String r1:a) {
				System.out.println(r1);
				
			}
		}

	}}

