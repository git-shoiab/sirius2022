package xmlstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodDemo2 {
public static void main(String[] args) {
	List<Student> studentlist=new ArrayList<Student>();
	studentlist.add(new Student("ramu",22));
	studentlist.add(new Student("somu",21));
	studentlist.add(new Student("monu",32));
	studentlist.add(new Student("ranu",42));
	
	Double average=studentlist.stream().collect(Collectors.averagingDouble(s->s.getAge()));
	System.out.println(average);
	System.out.println(studentlist.stream().collect(Collectors.partitioningBy(s->s.getAge()>30)));
	
	System.out.println(studentlist.stream().collect(Collectors.partitioningBy((Student s)->s.getAge() > 20,Collectors.counting())));
	System.out.println(studentlist.stream().collect(Collectors.partitioningBy((Student s)->s.getAge() > 20,Collectors.counting())));
}
}

class Student{
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}