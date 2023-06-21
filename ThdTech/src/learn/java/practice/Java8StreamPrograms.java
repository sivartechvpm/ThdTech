package learn.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamPrograms {

	public static void main(String args[]) {

		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1, "siva", 23, "male", "Good dept", 2015, 400000));
		empList.add(new Emp(3, "siva", 23, "male", "Good dept", 2015, 400000));
		empList.add(new Emp(2, "kumar", 12, "male", "One dept", 2013, 1000));
		empList.add(new Emp(3, "sindhu", 18, "femalemale", "HR", 2019, 20000));

		// Get count by gender

		Map<String, Long> getCountByGender = empList.stream()
				.collect(Collectors.groupingBy(e -> e.gender, Collectors.counting()));
		System.out.println(getCountByGender);

		empList.stream().collect(Collectors.groupingBy(e -> e.name)).entrySet().stream()
				.forEach(k -> System.out.println(k.getKey() + "-->" + k.getValue()));
		;

		// Optional<Emp> e = empList.stream().max(Comparator.comparing(Emp.getId()));

		// System.out.println(Emp::getId);

	}

}

class Emp {

	int id;
	String name;
	int age;
	String gender;
	String dept;
	int dojYear;
	int salary;

	public Emp(int id, String name, int age, String gender, String dept, int dojYear, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.dojYear = dojYear;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class student {

	static student instance = null;
	int stdId;

	private student(int stdId) {
		super();
		this.stdId = stdId;
	}

	public synchronized student getInstance() {

		if (instance == null) {
			instance = new student(1);
		}
		return instance;
	}

}
