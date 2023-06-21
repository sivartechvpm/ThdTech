package learn.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AlternateNumber {

	public static void main(String[] args) {

		// Question no 1
		A a = new B();
		// a.m2();
		a.m1();
		System.out.println("-----------------------------------------------------------");
		
		
		
		
	
		// Question 2 :

		// input -> [1,2,3,4,5,6,7]
		// output -> [4,8,12]
		// Java 8

		// int[] input = {1,2,3,4,5,6,7};

		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		input.stream().filter(x -> x % 2 == 0).map(x -> x * 2).forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------");
		
		
		
		

		// Quertion 3:

		/*Customer c1 = new Customer("Adit");
		Customer c2 = new Customer("Adit");
		HashSet<Customer> customerSet = new HashSet<>();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
		
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size());

		System.out.println("-----------------------------------------------------------");*/
		
	//Customer cus1=new Customer();
	//	Customer cus2=new Customer();
		//System.out.println(cus1.equals(cus2));
		String s1="siva";
		System.out.println(s1.hashCode());
		System.out.println(new String("siva").hashCode());
		System.out.println(new String("siva").hashCode());
	//	System.out.println(().equals(new Integer(1).hashCode()));
		

	}

}

class Customer {

	private String name;
	private Integer id;
	public Customer(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	

}

class A {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}
