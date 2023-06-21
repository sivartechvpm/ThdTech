package learn.java;

import java.lang.constant.ConstantDesc;
import java.util.Arrays;
import java.util.Collections;

public class JavaEightPrograms {

	public static void main(String[] args) {

		// Filter
		// Arrays.asList("Siva","kumar").stream().filter(x->
		// !x.startsWith("S")).forEach(x-> System.out.println(x));

		// Map
		// Arrays.asList("Siva","kumar").stream().map(x-> x+" Added").forEach(x->
		// System.out.println(x));

		// Sorting - Ascending
		// Arrays.asList(1,22,3,45).stream().sorted().forEach(x->
		// System.out.println(x));

		// Sorting - Descending
		// Arrays.asList(1,22,3,45).stream().sorted(Collections.reverseOrder()).forEach(x->
		// System.out.println(x));

		// limit
		// Arrays.asList(1,22,3,45).stream().limit(1).forEach(x->
		// System.out.println(x));

		// Max
		Integer maxVal = Arrays.asList(1, 22, 3, 45).stream().max(Integer::compareTo).get();
		System.out.println(maxVal);

		// Min
		Integer minVal = Arrays.asList(1, 22, 3, 45).stream().min(Integer::compareTo).get();
		System.out.println(minVal);
		
		//Functional Interface
		
		//Fi = (x-> "siva";
		

	}

}


interface Fi{
	
	String printMessage(int k);
}




class Employee {

	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
