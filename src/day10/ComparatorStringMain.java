package day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
}

public class ComparatorStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> com = new Comparator<Integer>();
		public int compare(Integer i,Integer j) {
			if(i > j)
				return 1;
			else
				return -1;
		}
		
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(24,"Ankush"));
		stud.add(new Student(25,"Vishal"));
		stud.add(new Student(22,"Sudhir"));
		
		System.out.println(stud);
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}

}
